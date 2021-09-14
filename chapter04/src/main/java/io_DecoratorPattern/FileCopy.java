package io_DecoratorPattern;

import java.io.*;

public class FileCopy {

	public static void main(String[] args) {

		// final의 is.close를 위해서 널로 미리 만들어둠
		InputStream is = null;
		OutputStream os = null;

		// 파일이 없는 경우를 대비해서 강제로 try/catch 를 강제시킴
		try {
			is = new FileInputStream("Samsung.jpg");
			os = new FileOutputStream("Samsung.copy.jpg");
			// is.read();

			int data = 0;

			// is.read()에서 에러가 생기는 이유 : IOException 에러 catch문이 없어서
			while ((data = is.read()) != -1) {
				
				os.write(data);

			}

		} catch (FileNotFoundException e) {
			System.out.println("file not fount:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally { // 자원정리
			try {
				if (is != null) {
					is.close();
				}

				if (os != null) {
					os.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
