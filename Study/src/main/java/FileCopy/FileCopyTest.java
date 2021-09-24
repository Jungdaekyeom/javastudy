package FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {
	public static void main(String[] args) {

		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("Samsung.jpg");
			os = new FileOutputStream("Samsung2.jpg");
//			is.read();

			int data = 0;

			while ((data = is.read()) != -1) {
				os.write(data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not fount:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (is != null) {
					is.close();
				}

				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
