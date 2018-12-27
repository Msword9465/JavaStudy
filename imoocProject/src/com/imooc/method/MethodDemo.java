package com.imooc.method;

public class MethodDemo {

	// 无参数无返回值
	public void printStar() {
		System.out.println("********************");
	}

	// 无参数有返回值
	public int area() {
		int length = 10;
		int width = 5;
		int getArea = length * width;
		return getArea;
	}

	// 有参数有返回值
	public void getMax(float a, float b) {
		float max;
		if (a > b)
			max = a;
		else
			max = b;
		System.out.println(a + "和" + b + "的最大值" + max);
	}

	public static void main(String[] args) {
		// 创建MethodDemo的myMd对象
		MethodDemo myMd = new MethodDemo();
		// 使用对象名().方法名调用方法
		myMd.printStar();
		System.out.println("     欢迎来到Java的世界");
		myMd.printStar();
		System.out.println();

		MethodDemo rc = new MethodDemo();
		System.out.println("长方形的面积" + rc.area());
		System.out.println();

		MethodDemo max = new MethodDemo();
		float a = 10.4f, b = 15.3f;
		max.getMax(a, b);
		max.getMax(0.9f, 1.3f);
		System.out.println();

	}

}
