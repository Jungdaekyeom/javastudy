package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int i;
		
		System.out.println("숫자를 입력하세요");
		num = scanner.nextInt();
		
		if(num%2==1) {
			
			for(i=1; i<=num; i=i+2) {
				sum+=i;
			}
			
			System.out.println(sum);
		}
		
		else if(num%2==0) {
			
			for(i=0; i<=num; i=i+2) {
				sum+=i;
			}
			
			System.out.println(sum);
		}
		
		scanner.close();
	}
}
