package httpd;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;

public class RequestHandler extends Thread {
	private static final String DOCUMENT_ROOT = "./webapp";
	private Socket socket;

	public RequestHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			// get IOStream
			OutputStream outputStream = socket.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// logging Remote Host IP Address & Port
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			consoleLog("connected from " + inetSocketAddress.getAddress().getHostAddress() + ":"
					+ inetSocketAddress.getPort());

			String request = null;
			while (true) {
				String line = br.readLine();

				// 브라우저가 연결을 끊으면,
				if (line == null) {
					break;
				}

				// SimpleHttpServer에서는 요청의 헤더만 읽음
				if ("".equals(line)) {
					break;
				}

				// [RequestHandler#11] GET / HTTP/1.1
				// [RequestHandler#12] GET /favicon.ico HTTP/1.1
				// 여기서 끊기 위함
				// 헤더의 첫 번째 라인만 읽음
				if (request == null) {
					request = line;
					break;
				}
			}

			// 요청 처리
			consoleLog(request);

			String[] tokens = request.split(" ");
			if ("GET".equals(tokens[0])) {
				consoleLog("request : " + tokens[1]);
				responseStaticResource(outputStream, tokens[1], tokens[2]);

			} else {
				System.out.println(tokens[0]);
				// methods: POST, PUT, DELETE, HEAD, CONNECT
				// SimpleHttpServer에서는 무시(400 Bad Request 처리)
				
				// response400Error(outputStream, tokens[1], tokens[2]); = 과제
				// outputStream.write("HTTP/1.1 200 OK\n".getBytes("UTF-8"));
				// outputStream.write("Content-Type:text/html; charset=utf-8\n".getBytes("UTF-8"));
				// outputStream.write("\n".getBytes());
				// outputStream.write("<h1>이 페이지가 잘 보이면 실습과제 SimpleHttpServer를 시작할 준비가 된 것입니다.</h1>".getBytes("UTF-8"));
				
				// outputStream.write 400 에러를 고지하는 내용을 써야함
				// https://google.com/sadfasdfqweqw
			}

			// 예제 응답입니다.
			// 서버 시작과 테스트를 마친 후, 주석 처리 합니다.
			// outputStream.write("HTTP/1.1 200 OK\n".getBytes("UTF-8"));
			// outputStream.write("Content-Type:text/html; charset=utf-8\n".getBytes("UTF-8"));
			// outputStream.write("\n".getBytes());
			// outputStream.write("<h1>이 페이지가 잘 보이면 실습과제 SimpleHttpServer를 시작할 준비가 된 것입니다.</h1>".getBytes("UTF-8"));

		} catch (Exception ex) {
			consoleLog("error:" + ex);
		} finally {
			// clean-up
			try {
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException ex) {
				consoleLog("error:" + ex);
			}
		}
	}

	// OS랑 URL, protocol 을 받음
	private void responseStaticResource(OutputStream outputStream, String url, String protocol) throws IOException {

		// welcome file set
		if ("/".equals(url)) {
			url = "/index.html";
		}

		File file = new File(DOCUMENT_ROOT + url);
		if (!file.exists()) {
			System.out.println("..........................");
			// response404Error(outputStream, url, protocol);
			// outputStream.write("HTTP/1.1 200 OK\n".getBytes("UTF-8"));
			// outputStream.write("Content-Type:text/html; charset=utf-8\n".getBytes("UTF-8"));
			// outputStream.write("\n".getBytes());
			// outputStream.write("<h1>이 페이지가 잘 보이면 실습과제 SimpleHttpServer를 시작할 준비가 된 것입니다.</h1>".getBytes("UTF-8"));
			// view-source:https://www.naver.com/asdf/asdf/asdf/sdf
			return;
		}

		// nio
		// try - catch 를 안쓰고 throws로 날려버림
		// 1
		byte[] body = Files.readAllBytes(file.toPath());
		// 2
		String contentType = Files.probeContentType(file.toPath());

		
		// 1
		outputStream.write((protocol + " 200 OK\n").getBytes("UTF-8"));
		outputStream.write("Content-Type:text/html; charset=utf-8\n".getBytes("UTF-8"));
		outputStream.write("\n".getBytes());
		// 왜 body로 읽지?
		outputStream.write(body);

		outputStream.write("==========================================================".getBytes("UTF-8"));
		
		
		// 2 
		outputStream.write((protocol + " 200 OK\n").getBytes("UTF-8"));
		outputStream.write(("Content-Type:"+contentType + "; charset=utf-8\n").getBytes("UTF-8"));
		outputStream.write("\n".getBytes());
		// 왜 body로 읽지?
		outputStream.write(body);

		
	}

	private void response404Error(OutputStream outputStream, String url, String protocol) {
		// TODO Auto-generated method stub

	}

	public void consoleLog(String message) {
		System.out.println("[RequestHandler#" + getId() + "] " + message);
	}
}