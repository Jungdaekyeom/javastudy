package Wrapper;

public class WrapperClassTest {

	public static void main(String[] args) {

		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		Integer i1 = 20;
		Integer i2 = new Integer(20);

		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		Boolean b1 = true;
		Boolean b2 = new Boolean(true);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

		String s1 = "123456";
		int ii = Integer.parseInt(s1);
		
		System.out.println(s1.getClass().getName());
		System.out.println(ii);
		
		String s2 = String.valueOf(ii);
		System.out.println(s2.getClass().getName());
		
	}

}
