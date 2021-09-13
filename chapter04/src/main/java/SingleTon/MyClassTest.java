package SingleTon;

public class MyClassTest {

	public static void main(String[] args) {

		// 생성자가 private 라 못만듬
		// MyClass myClass0 = new MyClass();

		MyClass myClass1 = MyClass.getInstance();
		MyClass myClass2 = MyClass.getInstance();

		System.out.println(myClass1 == myClass2);
	}

}
