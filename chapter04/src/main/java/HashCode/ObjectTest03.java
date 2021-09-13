package HashCode;

public class ObjectTest03 {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// 해시 코드
		System.out.println(s1.hashCode() + ":" + s2.hashCode());
		// 주소 기반의 해싱
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2) );
		
		System.out.println("=================================");

		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		// 해시 코드
		System.out.println(s3.hashCode() + ":" + s4.hashCode());
		// 주소 기반의 해싱
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4) );
		
		
	}

}
