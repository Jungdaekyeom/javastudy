package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		int price50000;
		int price10000;
		int price5000;
		int price1000;
		int price500;
		int price100;
		int price50;
		int price10;
		int price5;
		int price1;

		/* 코드 작성 */

		System.out.println("금액 : ");
		int price = scanner.nextInt();
		
		price50000 = price/50000;
		price = price%50000;
		System.out.println("50000원 : " + price50000);
		
		price10000 = price/10000;
		price = price%10000;
		System.out.println("10000원 : " + price10000);

		price5000 = price/5000;
		price = price%5000;
		System.out.println("5000원 : " + price5000);

		price1000 = price/1000;
		price = price%1000;
		System.out.println("1000원 : " + price1000);
		
		price500 = price/500;
		price = price%500;
		System.out.println("500원 : " + price500);
		
		price100 = price/100;
		price = price%100;
		System.out.println("100원 : " + price100);
		
		price50 = price/50;
		price = price%50;
		System.out.println("50원 : " + price50);

		price10 = price/10;
		price = price%10;
		System.out.println("10원 : " + price10);

		price5 = price/5;
		price = price%5;
		System.out.println("5원 : " + price5);
		
		price1 = price/1;
		price = price%1;
		System.out.println("1원 : " + price1);
		
		scanner.close();
	}
}