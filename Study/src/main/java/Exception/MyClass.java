package Exception;

import java.io.IOException;

public class MyClass {

	public void danger() throws IOException, MyException {
		System.out.println("some codes1");
		System.out.println("some codes2");

		if (10 - 10 == 0) {
			throw new IOException();

		}

		System.out.println("some codes1");
		System.out.println("some codes2");
	}

}
