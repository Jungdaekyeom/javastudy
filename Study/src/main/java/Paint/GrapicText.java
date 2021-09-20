package Paint;

public class GrapicText implements Drawable {

	private String text;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	public void draw(boolean visible) {
		System.out.println(getText() + "를 그렸습니다!");
	}

}
