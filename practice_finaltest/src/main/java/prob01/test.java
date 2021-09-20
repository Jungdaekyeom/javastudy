package prob01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		
		int[] arr = new int[9]; // 스택4
		int top;

		for(top = 0; top <9;) {

			if (top == 9) {
				break;
			}

			int value = randomize(1, 9) * randomize(1, 9);
			boolean isExist = false;

			for (int i = 0; i < top; i++) {
				if (arr[i] == value) {
					System.out.println("중복발생 : " + arr[i]);
					isExist = true;
					break;
				}
			}

			if (isExist) {
				continue;
			}

			arr[top] = value;
			top++;
		}
	
		System.out.println(Arrays.toString(arr));
		System.out.println("===================================");

	}

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}
}
