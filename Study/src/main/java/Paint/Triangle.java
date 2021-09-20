package Paint;

public class Triangle extends Shape{
	
	private int x1, y1;
	private int x2, y2;
	private int x3, y3;

	/**
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * @param y1 the y1 to set
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * @return the x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * @param x2 the x2 to set
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * @return the y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * @param y2 the y2 to set
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

	/**
	 * @return the x3
	 */
	public int getX3() {
		return x3;
	}

	/**
	 * @param x3 the x3 to set
	 */
	public void setX3(int x3) {
		this.x3 = x3;
	}

	/**
	 * @return the y3
	 */
	public int getY3() {
		return y3;
	}

	/**
	 * @param y3 the y3 to set
	 */
	public void setY3(int y3) {
		this.y3 = y3;
	}

	@Override
	public void draw(boolean visible) {
		// TODO Auto-generated method stub
		
		System.out.println("삼각형을 그려습니다.");

		
	}

}
