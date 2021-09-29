package chaper03;

public class SwapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		System.out.println(a + " : " + b);
		
		/* Swap하기 */
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a + " : " + b);
		

	}

}
