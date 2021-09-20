package Exception;

public class ExceptionTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 10 - a;

		System.out.println("1");

		try {
			System.out.println("1.5");
			int result = (1 + 2 + 3) / b;
		} catch (ArithmeticException e) {

			/* 예외 처리 */
			// 1. 사과(Apologize)
			System.out.println("すみません。エラーが発生しました。");
			// 2. 로깅(Logging)
			System.out.println("error : " + e);
			// 3. 정상종료
			return;

		} finally {
			System.out.println("자원 정리");
		}
	}

}
