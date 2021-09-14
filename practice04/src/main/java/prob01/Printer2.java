package prob01;

public class Printer2 {
	// 파라미터 T에 대한 제네릭
	public <T> void println(T t) {
		System.out.println(t);
	}
	
	public <T, R> void println(T t, R r) {
		System.out.println(t);
	}
	

}
