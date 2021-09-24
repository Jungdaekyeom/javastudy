package HashCode;

public class ObjectTest01 {
	
	public static void main(String[] args) {
		
		Point p = new Point(10, 20);
		Point p2 = new Point(10, 30);
		
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p2.hashCode());
		
	}

}
