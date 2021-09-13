package com.douzone.paint.main;

import java.awt.Color;

import com.douzone.paint.i.*;
import com.douzone.paint.point.*;
import com.douzone.paint.shape.*;
import com.douzone.paint.text.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point1 = new Point();
		
		point1.setX(10);
		point1.setY(10);
		
//		drawPoint(point1);
//		point1.disapear();
		point1.show(false);
		
		ColorPoint colorPoint1 = new ColorPoint(10, 20, "blue");
		
		colorPoint1.setX(100);
		colorPoint1.setY(200);
		colorPoint1.setColor("red");
		
		drawColorPoint(colorPoint1);
		
//		Point point2;
//		
//		String input = "color";
//		if(input.equals("color")) {
//			point2 = new ColorPoint();
//		}else {
//			point2 = new Point();
//		}
//		
//		point2.setX(100);
//		point2.setY(200);
		
		Point point2 = new ColorPoint(100, 200, "green");
		
		
		((ColorPoint)point2).setColor("Blue");
		// drawPoint(point2);
		draw(point2);
		
		point2.show(false);
		point2.show(true);
		draw(point2);
		
		Triangle triangle = new Triangle();
		// drawTriangle(triangle);
		// drawsShape(triangle);
		draw(triangle);
		
		Rectangle rectangle = new Rectangle();
		// drawRectangle(rectangle);
		// drawShape(rectangle);
		draw(rectangle);
		
		Circle circle = new Circle();
		// drawCircle(circle);
		// drawShape(circle);
		draw(circle);
		
		GraphicText text = new GraphicText("Hello World");
		draw(text);
		
		// instanceof test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 오류 : class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다.
		//System.out.println(circle instanceof Rectangle);
		
		// interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
		

		
	}
	
	public static void drawPoint(Point point) {
		point.show();
		System.out.println("============================");
	}
	
	public static void drawColorPoint(ColorPoint colorPoint) {
		colorPoint.show();
		System.out.println("============================");
	}	
	
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawShape(Shape shape) {
//		shape.draw();	
//	}
//	
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
//	
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
//	
	
	
	// instanceof
	///////////////////////////////////////////////////////////////////////////
	
	
}
