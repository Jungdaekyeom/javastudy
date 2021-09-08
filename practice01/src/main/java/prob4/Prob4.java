package prob4;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		
		
		for(int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		
		scanner.close();
	}

}
