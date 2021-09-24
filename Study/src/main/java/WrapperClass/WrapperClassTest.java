package WrapperClass;

import java.util.ArrayList;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "123456";

		// 문자열을 int형으로 바꾸고 싶을 때
		Integer i = Integer.parseInt(s1);
		System.out.println(i + 1);

		// int형을 문자열로 바꾸고 싶을 때
		String s2 = String.valueOf(i);
		System.out.println(s2 + "걃");

		System.out.println(i + ":" + i.getClass().getName());
		System.out.println(s2 + ":" + s2.getClass().getName());
		
		char c = 'c';
		int a = Character.getNumericValue('a');
		
		System.out.println(s2.getClass().getName());
		System.out.println(a);
		System.out.println((int)c);
		
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4);

		String s5 = Integer.toHexString(15);
		System.out.println(s5);
		
		String s6 = Integer.toOctalString(15);
		System.out.println(s5);
	}
	
}
