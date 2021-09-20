package Chat;

import java.io.*;

public class ChatClientThread extends Thread {

	private BufferedReader br;
	private String nickname;

	public ChatClientThread(BufferedReader br, String nickname) {
		this.br = br;
		this.nickname = nickname;
	}

	@Override
	public void run() {
		while (true) {
			String data = null;
			try {
				data = br.readLine(); // 계속 읽어들임
				
				System.out.println(data);

				if ("OK".equals(data)) {
					System.out.println("[client connect complete");
					continue;
				}
			} catch (IOException e) {
				System.out.println("\r\n[client] closed by client");
				break;
			}
		}
	}

}
