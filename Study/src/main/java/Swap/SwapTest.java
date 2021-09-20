package Swap;

public class SwapTest {

	public static void main(String[] args) {

		Value a = new Value(10);
		Value b = new Value(20);

		System.out.println(a.val + " : " + b.val);

		swap(a, b);

		System.out.println(a.val + " : " + b.val);

	}

	public static void swap(Value a, Value b) {
		int temp;

		temp = a.val;
		a.val = b.val;
		b.val = temp;
	}

}
