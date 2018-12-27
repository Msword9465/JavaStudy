package com.imooc.method;

public class Rectangle {
	
	public int area() {
		int length=10;
		int width=10;
		int getArea = length*width;
		return getArea;
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle();
		int area=rc.area();
		System.out.println("长方形的面积为："+area);

	}

}
