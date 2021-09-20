package Paint;

public class Point implements Drawable {

	private int x;
	private int y;
	private boolean visible;

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * @param visible the visible to set
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	// 생성자
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw(boolean visible) {
		this.visible = visible;
		show(visible);
	}


	public void show(boolean visible) {

		if (visible == true) {
			System.out.println("Point [x=" + x + ", y=" + y + ", visible=" + visible + "]을 그렸습니다.");
		} else {
			System.out.println("Point [x=" + x + ", y=" + y + ", visible=" + visible + "]을 지웠습니다.");
		}
	}

}
