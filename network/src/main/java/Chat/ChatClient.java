package Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClient {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 8888;
	private static String nickname = null;

	public static void main(String[] args) {

		// 1. 키보드 연결
		Scanner scanner = null;

		// 2. 소켓 생성
		Socket socket = null;

		try {

			scanner = new Scanner(System.in);
			socket = new Socket();

			// 3. 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			System.out.println("연결 성공");

			// 뭔지 모르겠음.
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			// true : 버퍼를 비워줌 : printwriter의 버퍼를 비워줌.
			// printwriter는 readline으로 버퍼 째로 보냄
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			// 첫 문장에 join을 넣고 보냄
			String join = "JOIN:";
			System.out.print("이름을 입력하세요 : ");
			nickname = scanner.nextLine();

			System.out.println(nickname + "님 안녕하세요.");
			// 첫 참가를 알리기 위해서
			pw.println(join + nickname);

			// 6. ChatClientReceiveThread 시작
			// ChatClientThread가 뭐하는건진 모르겠음.
			Thread chatClientThread = new ChatClientThread(br, nickname);
			chatClientThread.start();

			while (true) {
				System.out.print(">>");
				String line = scanner.nextLine();

				if ("exit".equals(line)) {

					pw.println("exit:" + nickname);
					break;
				} else {
					// 9. 메시지 처리
					pw.println("msg:" + line);
					// ChatServerThread.log("msg:" + line);
				}

			}

		} catch (SocketException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (scanner != null) {
					scanner.close();

				}
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
