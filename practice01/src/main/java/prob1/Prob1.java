package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		int num=0;
		
		System.out.println("숫자 입력 : ");
		num = scanner.nextInt();
		
		if(num%3==0) {
			System.out.println("3의 배수");
		}
		else {
			System.out.println("3의 배수 아님");
		}
		
		scanner.close();
	}
}
