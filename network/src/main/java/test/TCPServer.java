package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

// 싱글턴(?)처럼 자기가 자기를 가리키는 상황

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			// 1. 서버소켓 생성
			serverSocket = new ServerSocket();

			//1-1. TIME_WAIT 상태에서도 소켓 포트 번호 할당이 가능하도록 하기 위해서..
			serverSocket.setReuseAddress(true);

			// 2. 바인딩(binding)
			// Socket에 InetSocketAddress(IPaddress + port)
			// IPAddress : 0.0.0.0 : 모든 IP로부터의 연결을 허용
			// IPAddress : 0.0.0.0 : 특정 호스트 IP바인딩하지 않는다.

			serverSocket.bind(new InetSocketAddress("0.0.0.0", 5000), 10);
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 5000), 10);

			// 실제로는 자기 IP를 저 곳에 넣어야 함(115.22.11.145)
			// 자기 아이피를 숫자로 넣기보다는, 프로그램적으로 해결해서 넣을 것.
			// InetAddress.getLocalHost().getHostAddress()
			// serverSocket.bind(new
			// InetSocketAddress(InetAddress.getLocalHost().getHostAddress(), 5000));

			// 3. accept
			// 클라이언트로부터 연결 요청을 기다린다.
			Socket socket = serverSocket.accept(); // blocking!
			System.out.println("연결 완료!!!");

			// 이 시점에서 XShell에서 telnet 127.0.0.1 5000 을 실행해줘야 한다.
			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();

			InetSocketAddress mylocal = (InetSocketAddress) socket.getLocalSocketAddress();

			System.out.println("내 로컬 나가는 포트");
			System.out.println(mylocal.getPort());
			System.out.println(mylocal.getHostName());
			System.out.println(mylocal.getAddress());
			System.out.println(mylocal.getHostString());
			System.out.println("===================");

			System.out.println("나한테 다시 들어오는 포트");
			System.out.println(inetRemoteSocketAddress.getPort());
			System.out.println(inetRemoteSocketAddress.getHostName());
			System.out.println(inetRemoteSocketAddress.getAddress());
			System.out.println(inetRemoteSocketAddress.getHostString());

			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
			int remoteHostPort = inetRemoteSocketAddress.getPort();

			// 상대편 포트 : remoteHostPort
			System.out.println("[server] connected by clinet[" + remoteHostAddress + ":" + remoteHostPort + "]");

			try {
				// 4. IO Stream 받아오기
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				// 대기 상태로 들어가기 위해서 무한 루프로 읽기(공부를 위해서)
				while (true) {

					byte[] buffer = new byte[256];

					// 5. 데이터 읽기
					// 안녕 => 이라는 문자가 입력되면 6바이트가 들어오게 됨.
					// 에러 발생 가능성이 있으므로, try/catch문 사용
					int readByteCount = is.read(buffer); // blocking

					// 해당 while문의 blocking이 있으므로 인해 서버가 끊기지 않음
					if (readByteCount == -1) {
						// -1이 나왔다는 얘기는
						// (반대편)클라이언트가 정상적으로 종료(close() 호출)

						// 콘솔창에 연결 후 컨알] 누르고 disconnect 누르면 출력됨
						System.out.println("[server] closed by client");
						break;
					}

					// 인코딩을 위해 버퍼의 0부터 readByteCount 까지
					// 문자 보내는 위치.

					String data = new String(buffer, 0, readByteCount, "utf-8");
					System.out.println("[server] received:" + data);

					//6. 데이터 쓰기
					// os.write(data.getBytes("utf-8"));
					try {
						Thread.sleep(2000);
						os.write(data.getBytes("utf-8"));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			} catch (SocketException ex) {
				System.out.println("[server] suddenly closed by client" + ex);
			} catch (IOException ex) {
				System.out.println("[server] error" + ex);
			} finally {
				try {
					if (socket != null && socket.isClosed() == false) {
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			// 서버 소켓 보내는 IOException
		} catch (IOException e) {
			System.out.println("[server error] " + e);
		} finally {
			try {
				if (serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
