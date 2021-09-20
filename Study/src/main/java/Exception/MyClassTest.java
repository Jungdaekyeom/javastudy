package Exception;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			MyClass myClass = new MyClass();
			myClass.danger();
		} catch (Exception e) {
			System.out.println("error:" + e);
		}

	}

}
