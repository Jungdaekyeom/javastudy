package prob01;

public class Printer3 {

	public int sum(Integer... nums) {
		int sum = 0;
		for(Integer i : nums) {
			sum += i;
		}
		
		return sum;
	}
	
}
