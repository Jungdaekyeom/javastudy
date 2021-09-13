package Wrapper;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "123456";

		// s1을 int형으로 바꾸고싶을때
		int i = Integer.parseInt(s1);

		// cf1 반대로
		String s2 = String.valueOf(i);
		// cf2 반대로
		String s3 = "" + i;

		System.out.println(s1 + " : " + s1.getClass().getName());
		System.out.println(s2 + " : " + s2.getClass().getName());
		System.out.println(s3 + " : " + s3.getClass().getName());

		char c = 'A';
		int a = Character.getNumericValue('A');
		System.out.println(a); // 16진수로 표기되므로, a는 10
		System.out.println((int) c);

		// 2진수
		String s4 = Integer.toBinaryString(15);
		System.out.println("15의 2진수 값 : " + s4);

		// 16진수

		String s5 = Integer.toHexString(15);
		System.out.println("15의 16진수 값 : " + s5);
	}

}
