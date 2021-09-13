package prob01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// set을 사용해야 함

public class Gugudan {

	static int resultNumber = 0;

	public static void main(String[] args) {
		int l = randomize(1, 9);
		int r = randomize(1, 9);

		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers();
		// 하나는 정답이 나와야 하므로, 0~8까지 총 9개의 위치 중에서 랜덤으로 위치설정
		int loc = randomize(0, 8);
		// 배열 : 리스트
		answerNumbers[loc] = resultNumber;

		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;

		// ABC
		// DEF
		// GHI 순으로 정렬
		for (int i = 0; i < length; i++) {
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}

			System.out.print(answerNumbers[i]);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		s.close();

		System.out.println((answer == resultNumber) ? "정답" : "오답");
	}

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static int[] randomizeAnswers() {
		/* 코드 작성(수정 가능) */
		final int COUNT_ANSWER_NUMBER = 9;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];
				
		Set<Integer> s = new HashSet<>();
		
		while(true) {
			int a = randomize(1, 9);
			int b = randomize(1, 9);
			
			s.add(new Trap(a, b));
			
			if(s.size() == 9) {
				System.out.println(s);
				break;
			}
		}

		return boardNumbers;
	}
}
