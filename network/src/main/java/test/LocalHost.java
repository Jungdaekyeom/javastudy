package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {

	public static void main(String[] args) {

		// 127.0.0.1
		// 네트워크도 트라이/캐치문 필요

		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			String hostname = inetAddress.getHostName(); // 호스트의 이름
			String hostinetAddress = inetAddress.getHostAddress();

			System.out.println(hostname); // 704-13
			System.out.println(hostinetAddress);

			byte[] addresses = inetAddress.getAddress();
			for (byte address : addresses) {
				System.out.println(address); // 음수값도 출력됨
				System.out.println((int) address); // 이것도 마찬가지로 두개를 합치면 음수
				// 아마도 음수의 경우, 뒤에서부터 생각하는 것 같다.
			}

			System.out.println("============================");
			// Address를 바로 and연산
			for (byte address : addresses) {
				// 2의 보수 공부
				// 115 22 11 -111로 나오는걸 2의 보수를 취함
				// 마지막 두 칸을 f(11111111)로 계산해서 2의 보수화해줌으로써
				// 음수를 양수화
				System.out.print((address & 0x000000ff) + ".");
			}

		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

	}

}
