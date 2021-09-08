package paint;

public class Point {

	private int x;
	private int y;

	public Point(int i, int j) {
		this.x = i;
		this.y = j;
		// TODO Auto-generated constructor stub
	}

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		// TODO Auto-generated method stub

		System.out.println("점[x=" + x + ", y=" + y + "] 을 그렸습니다.");

	}
	
	public void show(boolean visible) {
		if(visible) {
//			System.out.println("점[x=" + x + ", y=" + y + "] 을 그렸습니다.");
			// 오버로딩
			show();
		} else {
//			System.out.println("점[x=" + x + ", y=" + y + "] 을 지웠습니다.");
			// 오버로딩
			disapear();

		}
	}

	public void disapear() {
		System.out.println("점[x=" + x + ", y=" + y + "] 을 지웠습니다.");

	}

}
