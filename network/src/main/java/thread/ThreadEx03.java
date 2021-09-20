package thread;

public class ThreadEx03 {
	
	public static void main(String[] args) {
		Thread thread1 = new DigitThread();
		Thread thread2 = new AlphabetThread();
		
		// 부모가 Thread가 아니라서 그냥 new UpperCaseAlphabetRunnableImpl() 불가
		// Thread 함수에 runnable형태로 UpperCaseAlphabetRunnableImpl()를 넣고
		// 
		Thread thread3 = new Thread(new UpperCaseAlphabetRunnableImpl());

		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
