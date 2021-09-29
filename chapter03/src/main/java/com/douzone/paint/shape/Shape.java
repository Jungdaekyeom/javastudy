package com.douzone.paint.shape;

import com.douzone.paint.i.Drawable;

// 리펙토링중....(더 좋은 구조로 만들기 위해서)
public abstract class Shape implements Drawable{

	private String lineColor;
	private String fillColor;
	
//	public abstract void draw();

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

}
