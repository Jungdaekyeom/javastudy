package io_DecoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 1. 기반 스트림(표준입력, stdin, System.in)

			// 2. 보조 스트림1(byte|byte|byte -> char)
			InputStreamReader isr = new InputStreamReader(System.in, "utf-8");

			// 3. 보조 스트림2(char1|char2|char3|char4|\n -> "char1char2char3char4"(스트링으로 만듬))
			br = new BufferedReader(isr);

			String line = null;
			// readLine은 스트링을 리턴해줌
			
			while ((line = br.readLine()) != null) {
				// Ctrl + z : 시그널 죽임
				if("quit".equals(line)) {
					break;
				}
				
				System.out.println(line);
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

			}
		}
	}

}
