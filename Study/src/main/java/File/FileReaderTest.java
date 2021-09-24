package File;

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

			while ((data = in.read()) != -1) {
				System.out.println((char) data);
				count++;
			}

			System.out.println(count);

		} catch (FileNotFoundException e) {
			System.out.println("error : " + e);
		} catch (Exception e) {
			System.out.println("error : " + e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
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
