package Chat;

import java.io.IOException;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

	// 포트 번호
	private static final int PORT = 8888;

	public static void main(String[] args) {

		ChatServerThread.log("시작");
		ServerSocket serverSocket = null;
		List<Writer> listWriters = new ArrayList<Writer>();

		try {
			// 1. serverSocket 생성
			serverSocket = new ServerSocket();

			// 2. 서버 연결
			// 0000은 모두에게 허락한다는 의미
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));

			while (true) {
				// blocking 상태. accept되길 기다림.
				// Client가 ip와 port번호를 맞추고 들어와 blocking이 풀리면, socket이 생성됨.
				Socket socket = serverSocket.accept();
				ChatServerThread.log("쓰레드 시작");

				// Thread의 하위에 있는 run 함수가 실행됨.
				new ChatServerThread(socket, listWriters).start();

			}

		} catch (IOException e) {

			System.out.println(e);
		} finally {
			try {
				if (serverSocket != null && serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
