package chaper03;

public class StaticMethod {

	int n;
	static int m;

	void f1() {
		System.out.println(n);

	}

	void f2() {

		System.out.println(StaticMethod.m);
		System.out.println(m); // 같은 클래스 내에서는 클래스 변수 접근 시 클래스 이름 생략 가능

	}

	void f3() {
		f2();
	}

	static void s1() {
		// 오류 : static method에서는 instance변수의 접근할 수 없다.
		// System.out.println(n);
		
	}
	
	static void s2() {
		System.out.println(StaticMethod.m);
		System.out.println(m); // 같은 클래스 내에서는 클래스 변수 접근 시 클래스 이름 생략 가능
	}
	
	static void s3() {
		// 오류 : static method 에서는 인스턴스 메소드에 접근할 수 없다.
		// f1();
		
	}
	
	static void s4() {
		StaticMethod.s1();
		s2();
		
	}

}
