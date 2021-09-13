package SingleTon;

public class MyClass {

	private static MyClass instance = null;

	private MyClass() {

	}

	// Singleton + Factory Method
	public static MyClass getInstance() {
		if (instance == null) {
			new MyClass();
		}

		return instance;

	}

}
