//package prob5;
//
//public class MainApp3 {
//
//	public static void main(String[] args) {
//		try {
//			MyStack03<String> stack = new MyStack03<>(3);
//			stack.push("Hello");
//			stack.push("World");
//			stack.push("!!!");
//			// stack.pop(1); // stack. 누르면 pop에서 뒤에 스트링만 나오는걸 볼 수 있음.
//			stack.push("1");
//			stack.push("java");
//
//			while (stack.isEmpty() == false) {
//				String s = (String)stack.pop();
//				System.out.println(s);
//			}
//
//			System.out.println("======================================");
//
//			stack = new MyStack03(3);
//			
//			stack.push("Hello");
//
//			System.out.println(stack.pop());
//			System.out.println(stack.pop()); // 여기서 에러 발생.
//
//		} catch (Exception ex) {
//			System.out.println(ex);
//		}
//	}
//
//}
