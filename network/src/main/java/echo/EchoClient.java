package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class EchoClient {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 6000;

	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;

		try {

			scanner = new Scanner(System.in);
			socket = new Socket();

			// 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			log("connected");

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			while (true) {
				System.out.println(">");
				String line = scanner.nextLine();

				if ("exit".equals(line)) {
					break;
				}

				// 개행을 붙임
				pw.println(line);

				String data = br.readLine();

				if (data == null) {
					log("closed by server");
					break;
				}
				
				System.out.println("<" + data);

			}
		} catch (SocketException ex) {
			log("suddenly closed by server");
		} catch (IOException ex) {
			log("error:" + ex);
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
	private static void log(String log) {
		System.out.println("[Echo Client] " + log);
	}
}