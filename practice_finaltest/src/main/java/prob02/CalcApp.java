package prob02;

import java.util.Scanner;

public class CalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			String expression = scanner.nextLine();

			if ("quit".equals(expression)) {
				break;
			}

			String[] tokens = expression.split(" ");

			if (tokens.length != 3) {
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}

			int lValue = Integer.parseInt(tokens[0]);
			int rValue = Integer.parseInt(tokens[2]);

			Arithmetic arithmetic = null;

			/* 코드 작성 */
			switch (tokens[1]) {
			case "-":
				arithmetic = new Sub();
				break;
			case "+":
				arithmetic = new Add();
				break;
			case "*":
				arithmetic = new Mul();
				break;
			case "/":
				arithmetic = new Div();
				break;
			}

			try {
				int result = arithmetic.calculate(lValue, rValue);
				System.out.println(">> " + result);

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} 
		
		}

		scanner.close();
	}
}