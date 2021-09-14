package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");

		// 제네릭 문제로도 풀어볼 것.
		Printer2 printer2 = new Printer2();

		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");

		// 가변 파라미터
		Printer3 printer3 = new Printer3();
		System.out.println(printer3.sum(1, 2));
		System.out.println(printer3.sum(1, 2, 3, 4, 5));
		System.out.println(printer3.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		// 가변 파라미터 + 제네릭
		Printer4 printer4 = new Printer4();

		printer4.println(10, true);
		printer4.println(10, true, 5.7, "홍길동");
		
		System.out.println(printer4.sum(1, 2));
		System.out.println(printer4.sum(1, 2, 3, 4, 5));
		System.out.println(printer4.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

	}
}