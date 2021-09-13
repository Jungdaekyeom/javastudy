package String;

public class StringTest02 {

	public static void main(String[] args) {
		
		// immutability(ºÒº¯¼º)
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;

		
		s2 = s1.toUpperCase();
		System.out.println(s2);
		
		
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		
		System.out.println(s4);
		System.out.println(s5);
		
		equalsHello(null);
	}
	
	private static boolean equalsHello(String s) {
		return s.equals("Hello");
//		return s.equals(s);
	}

}
