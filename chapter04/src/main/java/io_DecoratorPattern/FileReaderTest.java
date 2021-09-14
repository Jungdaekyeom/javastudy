package io_DecoratorPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {

		Reader in = null;
		InputStream is = null;

		try {
			
			in = new FileReader("1234.txt");

			int count = 0;
			int data = -1;

			// -1이 아닐때까지
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
				count++;
			}

			System.out.println("\ncount : " + count);
			// 한글은 한 개당 3바이트의 크기를 가지므로
			// 21바이트임을 텍스트 파일에서 확인할 수 있다.
			System.out.println("바이트 수 : " + count * 3);

			System.out.println("============================");

			count = 0;
			data = -1;

			is = new FileInputStream("1234.txt");

			while ((data = is.read()) != -1) {
				System.out.print((char) data);
				count++;
			}

			System.out.println("\ncount : " + count);

			System.out.println("============================");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
