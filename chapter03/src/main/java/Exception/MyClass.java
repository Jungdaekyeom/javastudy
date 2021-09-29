package Exception;

import java.io.IOException;

public class MyClass {
	
	// 에러를 던질 수 있는 함수라면, throws 가 반드시 필요
	public void danger() throws IOException, MyException {
		System.out.println("some codes1");
		System.out.println("some codes2");

		if (5-5==0) {
			throw new MyException();
		}
		
		if(10 - 10 == 0) {
			throw new IOException();
		}
		
		System.out.println("some codes3");
		System.out.println("some codes4");
		
	}
}
