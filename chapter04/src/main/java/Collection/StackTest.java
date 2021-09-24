package Collection;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();

		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");

		System.out.println(s);

		// 스택이 빌 때까지 돌림
		while (!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}

		System.out.println(s);

		// 비어있는 경우에는 예외 발생
		try {
			s.pop();
		} catch (Exception e) {
			System.out.println(" s.pop(); 예외 발생");
		}

		System.out.println("=====================");

		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");

		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());

	}

}
