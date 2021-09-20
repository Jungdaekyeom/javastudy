package Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServerThread extends Thread {

	/*
	 * 스레드의 인스턴스 변수 - 통신을 위한 스트림을 얻어 오기 위해 Socket 객체를 저장해야 한다. - 연결된 클라이언트의 닉네임을
	 * 저장하고 있어야 한다.
	 */
	Scanner scanner = null;
	private String nickname;
	private Socket socket;
	List<Writer> listWriters = new ArrayList<Writer>();

	public ChatServerThread(Socket socket, List<Writer> listWriters) {

		this.socket = socket;
		this.listWriters = listWriters;
	}

	/*
	 * 요청 처리를 위한 Loop 작성 - run 메소드 오버라이딩 - main thread로 부터 전달받은 socket를 통해 IO
	 * Stream을 받아오는데 문자 단위 처리와 라인 단위 읽기를 위해 보조 스트림 객체를 생성해서 사용한다.
	 */

	@Override
	public void run() {

		// getRemoteSocketAddress : 연결된 시스템에 대한 주소 반환
		InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
		String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
		int remoteHostPort = inetRemoteSocketAddress.getPort();

		// 상대편 포트 : remoteHostPort
		System.out.println("connected by client[" + remoteHostAddress + ":" + remoteHostPort + "]");

		try { //
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			while (true) {
				log("요청처리 시작");
				String data = br.readLine();

				if (data == null) {
					// 응답이 없으면
					System.out.println("closed by client");
					break;
				}

				// 4. 프로토콜 분석
				/*
				 * - chat 프로토콜 형식 - 요청명령: 파라미터1: 파라미터2: … \r\n - 각 요청을 구분하는 경계가 되는 것은 \r\n 이다. -
				 * 요청은 “:” 기준으로 요청명령과 파라미터로 분리한다. - 각 각의 요청명령을 처리하는 메서드를 구현하고 호출한다.
				 */
				String[] text = data.split(":");
				// pw.println(data);
				if ("JOIN".equals(text[0])) {

					doJoin(text[1], pw);

				} else if ("msg".equals(text[0])) {

					doMessages(text[1]);

				} else if ("quit".equals(text[0])) {

					doQuit(nickname, pw);
					break;

				} else {

					log("에러 : 알수 없는 요청(" + text[0] + ")");
				}

			}
		} catch (IOException e) {
			log("error: " + e);
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void addWriter(Writer writer) {
		synchronized (listWriters) {
			listWriters.add(writer);
		}
	}

	private void broadcast(String data) {
		/*
		 * - 서버에 연결된 모든 클라이언트에 메시지를 보내는(브로드캐스트) 메소드 - 스레드간 공유 객체인 listWriters 에 접근 하기
		 * 때문에 동기화 처리를 해 주어야 한다. - PrintWriter의 메서드를 사용해야 하기 때문에 다운 캐스팅을 명시적으로 해주었다.
		 */
		synchronized (listWriters) {
			log("broadcast 통과");
			// HashMap에서 값만 빼서 PrintWriter oos라는 변수에 대입을 한다.
			// null이 나오기전까지 계속 반복한다.
			for (Writer writer : listWriters) {
				PrintWriter pw = (PrintWriter) writer;
				pw.println(data);
				// oos(PrintWriter)의 함수 flush()를 호출한다.
				// flush함수를 호출하면 PrintWirter에 담겨있던 문자열을 연결된 Socket을 통해 전송하게 된다.
				// pw.flush();

			}
		}
	}

	private void doJoin(String nickName, PrintWriter writer) {
		this.nickname = nickName;

		String data = nickName + "님이 참여하였습니다.";
		broadcast(data);

		/* writer pool에 저장 */
		addWriter(writer);

		// ack
		writer.println("join:ok");
		writer.flush();
	}

	private void doQuit(String nickName, PrintWriter writer) {
		this.nickname = nickName;
		
		String data = nickname + "님이 퇴장 하였습니다.";
		broadcast(data);
		removeWriter(writer);
	}

	private void removeWriter(PrintWriter writer) {
		synchronized (listWriters) {
			listWriters.remove(writer);
		}

	}

	private void doMessages(String mesg) {
		/* 잘 구현 해보기 */
		broadcast(nickname + ":" + mesg);
	}

	public static void log(String s) {
		System.out.println(s);
	}

}
