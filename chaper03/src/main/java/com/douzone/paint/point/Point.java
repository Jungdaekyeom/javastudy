package com.douzone.paint.point;

import com.douzone.paint.i.Drawable;

public class Point implements Drawable {

	private int x;
	private int y;

	// 오버로딩
	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
		if (visible) {
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

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		show();

	}

}
