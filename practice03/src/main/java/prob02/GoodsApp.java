package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		for(int i=0; i<3; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int count = scanner.nextInt();
			
			goods[i] = new Goods();
			
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setCount(count);
		}

		for(int i =0; i<3; i++) {
			goods[i].print();
		}
		// 상품 입력

		// 상품 출
		
		// 자원정리
		scanner.close();
	}
}
