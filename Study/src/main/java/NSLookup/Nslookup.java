package NSLookup;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Nslookup {

	public static void main(String[] args) {

		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		String input = sc.nextLine();

		InetAddress[] inetAdd;
		try {
			inetAdd = InetAddress.getAllByName(input);
			for (InetAddress s : inetAdd) {
				System.out.println(s);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
