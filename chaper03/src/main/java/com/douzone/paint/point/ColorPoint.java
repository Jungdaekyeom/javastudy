package com.douzone.paint.point;

import java.util.*;

public class ColorPoint extends Point {

	// 캡슐화
	private String color;
	
	public ColorPoint(int x, int y, String color) {
//		setX(x);
//		setY(y);
		
		// 부모 클래스의 Point생성자에 접근
		super(x, y);
		this.color = color;
		
		
		// 자바 import 테스트
		List l = new ArrayList();

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {

		System.out.println("점[x=" + getX() + ", y=" + getY() + "] 을 그렸습니다.");
		System.out.println("색깔 : " + getColor());

	}

}
