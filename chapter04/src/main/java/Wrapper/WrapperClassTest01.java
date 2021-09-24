package Wrapper;

import java.sql.Date;

public class WrapperClassTest01 {

	public static void main(String[] args) {

		// Date d = new Date();
		// int i = d.getHours();

		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);

		// Auto Boxing
		// 자동으로 new 해줌
		
		Integer j1 = 10;
		Integer j2 = 10;
				
		// 동일성과 동질성이 똑같다.
		System.out.println(j1 == j2);
		System.out.println(j1.equals(j2));
		
		// Auto Auboxing
		// j1 안에 있는 10의 값이 자동으로 튀어나와서 더해짐
		int m = j1 + 10;
		// 위와 아래는 같다. 원래는 아래가 맞음. auto unboxing덕에 위처럼 사용가능
		int m2 = j1.intValue() + 10;
		
		System.out.println(m);
		System.out.println(m2);
		
		Integer aa = 3;
		Integer bb = 4;
		
		System.out.println(aa + bb);

		bb = bb + aa;
		
		System.out.println(bb.getClass().getName());
		
		Object obj = 3;
		Object obj2 = new Integer(3);
		
		
	}

}
