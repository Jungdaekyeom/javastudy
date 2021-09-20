package thread;

public class ThreadEx01 {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i);
//		}
		
		
		// (if 만약 두 개의 for문이 바뀌더라도) 
		// 멀티 스레드에서는 메인이 종료된다고 스레드가 종료되는게 아니라
		// 모든 스레드가 종료된 후에 메인이 종료된다.
		new DigitThread().start();
		
//		for (char c = 'a'; c < 'z'; c++) {
//			System.out.print(c);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}

}
