package Array;

import java.util.Arrays;

// Array에 대해 공부해보았다.
// 2021-09-19

public class ArrayStudy {

	public static void main(String[] args) {

		final int[] arr1 = { 1, 4, 3, 2, 5, 7, 9 };
		final int[] arr2 = { 1, 4, 3, 2, 5, 7, 9 };

		System.out.println(Arrays.toString(arr1));

		System.out.println(Arrays.binarySearch(arr1, 2));
		System.out.println(Arrays.hashCode(arr1));
		System.out.println(Arrays.deepEquals(args, args));

		// sort와 parallelSort 차이
		// 단순히 속도 차이.
		// 큰 데이터 처리에는 ParallelSort
		// 작은 데이터 처리에는 sort

		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));

	}

}
