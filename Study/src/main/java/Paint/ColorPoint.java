package Paint;

public class ColorPoint extends Point {

	private String color;

	// 생상저
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		
		System.out.println("색깔 : " + getColor() + getX() + getY());
	}

}
