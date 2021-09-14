package io_DecoratorPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");

			// 파일이 존재하는가 하지 않는가.
			if (!file.exists()) {
				System.out.println("file not found");
				return;
			}

			System.out.println("====== 파일 정보 ======");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(file.lastModified() + "초");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));

			System.out.println("====== 전화번호 ======");

			// 1. 기반 스트림(표준입력, stdin, System.in)
			FileInputStream fis = new FileInputStream(file);

			// 2. 보조 스트림1(byte|byte|byte -> char)
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");

			// 3. 보조 스트림2(char1|char2|char3|char4|\n -> "char1char2char3char4"(스트링으로 만듬))
			br = new BufferedReader(isr);

			String line = null;
			// readLine은 스트링을 리턴해줌

			// 4. 처리
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");

				int index = 0;
				while (st.hasMoreElements()) {
					String token = st.nextToken();
					if (index == 0) { // 이름
						System.out.print(token + ":");
					} else if (index == 1) { // 전번1
						System.out.print(token + "-");
					} else if (index == 2) { // 전번2
						System.out.print(token + "-");
					} else { // 전번3
						System.out.print(token);
					}
					index++;
				}

				System.out.println("");
			}

		} catch (UnsupportedEncodingException e) {
			System.out.println("error : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

}
