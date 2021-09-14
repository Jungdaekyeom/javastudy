package HashCode;

public class ObjectTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s0 = "Hello";
		String s00 = "Hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s0.hashCode());

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s0 == s1);
		System.out.println(s0.equals(s1));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(System.identityHashCode(s1) + " : " + System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s0) + " : " + System.identityHashCode(s00));

	}

}
