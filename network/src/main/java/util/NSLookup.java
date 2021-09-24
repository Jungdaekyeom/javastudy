package util;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {

		// Xshell
		// > www.douzone.com
		// 207.10.9.8
		// > www.naver.com
		// xxx.xxx.xxx.xxx
		// > quit
		// 종료됨

		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		// 이렇게 동작하는 클래스 제작
		String line = sc.nextLine();
		// 이름으로 ip를 모두 가져오겠다.
		try {
			InetAddress[] inetAddress = InetAddress.getAllByName(line);
			
			for(InetAddress s : inetAddress) {
				System.out.println(s);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
