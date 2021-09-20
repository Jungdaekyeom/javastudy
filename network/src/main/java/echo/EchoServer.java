package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private static final int PORT = 6000;

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();

			// .bind : 소켓에다가 주소를 바인딩한다.
			// 모두 받고 바인딩
			// 0000이나 자기 아이피 줘야함
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			log("starts... [port:" + PORT + "]");

			while (true) {
				// blocking 상태. accept되길 기다림.
				Socket socket = serverSocket.accept();
				// 09-16
				new EchoServerReceiveThread(socket).start();
			}

//			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
//			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
//			int remoteHostPort = inetRemoteSocketAddress.getPort();
//
//			// 상대편 포트 : remoteHostPort
//			log("connected by clinet[" + remoteHostAddress + ":" + remoteHostPort + "]");
//
//			try { //
//				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
//
//				while (true) {
//					String data = br.readLine();
//					if (data == null) {
//						log("closed by client");
//						break;
//					}
//
//					log("received: " + data);
//					pw.println(data);
//				}
//			} catch (IOException e) {
//				log("error: " + e);
//			} finally {
//				try {
//					socket.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//
		} catch (IOException e) {
			log("error: " + e);
		} finally {

			try {
				if (serverSocket != null && serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void log(String log) {
		System.out.println("[EchoServer] " + log);
	}

}
