package Paint;

public class Main {

	public static void main(String[] args) {

		Point point1 = new Point();

		point1.setX(25);
		point1.setY(35);
		point1.draw(true);
		point1.draw(false);

		ColorPoint colorPoint1 = new ColorPoint(10, 20, "blue");

		colorPoint1.show();

		Point point2 = new ColorPoint(100, 200, "greed");
		point2.show(false); // 부모 show 함수가 보임
		((ColorPoint) point2).show(); // 자식 show 함수가 보임

		draw(point2);

		point2.draw(false);

		Triangle triangle = new Triangle();
		// drawTriangle(triangle);
		// drawsShape(triangle);
		draw(triangle);
		
		GrapicText g = new GrapicText();
		g.setText("미소녀");
		g.draw(false);
		
	}

	public static void draw(Drawable drawable) {
		drawable.draw(false);
	}

}
