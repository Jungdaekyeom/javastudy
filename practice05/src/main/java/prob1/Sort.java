package prob1;

public class Sort {

	public static void main(String[] arg) {

		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count = array.length;

		System.out.println("Before sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//

		System.out.println("\n");
		int temp = 0;
		boolean flag = false;

		for (int b = 0; b < array.length - 1; b++) {

			flag = false;

			for (int a = 0; a < array.length - (1 + b); a++) {

				if (array[a] < array[a + 1]) {
					flag = true; // 바뀌었다.
					temp = array[a];
					array[a] = array[a + 1];
					array[a + 1] = temp;

				}

			}

			for (int i = 0; i < count; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
			if (!flag)
				break;
		}

		// 결과 출력
		System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}