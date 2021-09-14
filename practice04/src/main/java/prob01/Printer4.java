package prob01;

public class Printer4 {
	
	// 파라미터 T에 대한 제네릭
	
	public <T> void println(T... ts) {
		System.out.println(ts);
	}

	public int sum(Integer... nums) {
		int sum = 0;
		for(Integer i : nums) {
			sum += i;
		}
		
		return sum;
	}
	
}
