package prob01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gugudan {

	static int resultNumber = 0;

	public static void main(String[] args) {
		int l = randomize(1, 9);
		int r = randomize(1, 9);

		resultNumber = l * r;
		int[] answerNumbers = randomizeAnswers();
		int loc = randomize(0, 8);
		answerNumbers[loc] = resultNumber;

		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;
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
	
	public void sort(Set set) {
		
	}

	private static int[] randomizeAnswers() {
		/* 코드 작성(수정 가능) */
		final int COUNT_ANSWER_NUMBER = 9;
		int count = 0;
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];

//		Set<Trap> s = new HashSet<>();
		Set<Integer> s = new HashSet<>();
		//HashSet<Integer> s = new HashSet<>();
		while (true) {
			int l = randomize(1, 9);
			int r = randomize(1, 9);

			if (l*r == resultNumber) {
				continue;
			} else {
				s.add(l*r);	
			}
			
			// s.add(new Trap(l, r));

//			if (s.size() == 9) {
//				int i = 0;
//				for (Trap t : s) {
//					boardNumbers[i] = t.result();
//					i++;
//				}
//				break;
//			}
			
			if(s.size() == 9) {
				int i = 0;
				for (Integer number : s) {
					boardNumbers[i] = number;
					i++;
				}
				break;
			}
		}

		return boardNumbers;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
