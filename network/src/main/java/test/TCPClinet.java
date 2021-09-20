package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

public class TCPClinet {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 5500;

	public static void main(String[] args) {

		Socket socket = null;

		try {
			// 1. 소켓 생성
			socket = new Socket();

			// 1-1. 소켓 버퍼 사이즈 확인
			int rcvBufferSize = socket.getReceiveBufferSize();
			int sndBufferSize = socket.getSendBufferSize();
			System.out.println(rcvBufferSize + ":" + sndBufferSize);

			// 1-2. 소켓 버퍼 사이즈 변경
			socket.setReceiveBufferSize(1024 * 10);
			socket.setSendBufferSize(1024 * 10);
			rcvBufferSize = socket.getReceiveBufferSize();
			sndBufferSize = socket.getReceiveBufferSize();
			System.out.println(rcvBufferSize + ":" + sndBufferSize);

			// 1-3. SO_NODELAY(Nagle Algorithm off)
			// tcp 딜레이를 꺼버림(작은 데이터를 빨리빨리 보내야 할 때 유용)
			socket.setTcpNoDelay(true);

			// 1-4. SO_TIMEOUT
			socket.setSoTimeout(sndBufferSize);

			// 2. 서버 연결(accept와 connect 대칭)
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));

			// 3. IOStream 받아오기

			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// 4. 쓰기
			String data = "Hello World";
			os.write(data.getBytes("utf-8"));

			// 5. 읽기
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
			}

			new String(buffer, 0, readByteCount, "utf-8");
			System.out.println("[clinet] received:" + data);

		} catch (SocketTimeoutException e) {
			System.out.println("[client] time out");
		} catch (SocketException e) {
			System.out.println("[clinet] suddenly closed by server");
		} catch (IOException e) {
			System.out.println("[clinet] error : " + e);
		} finally {
			try {
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
