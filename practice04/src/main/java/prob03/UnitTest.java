package prob03;

public class UnitTest {
	
	public static void main(String[] args) {
		
		Unit unit1 = new Tank();
		
		unit1.stop();
		unit1.move(0, 0);
		((Tank)unit1).changeMode();
		
		
		
	}

}
