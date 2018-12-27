package com.imooc.method;

public class MathDemo {

	public int plus(int a, int b) {
		return a + b;
	}

	public double plus(double a, double b) {
		return a + b;
	}

	public int plus(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		return sum;
	}

	public static void main(String[] args) {
		//方法的重载
		MathDemo math = new MathDemo();
		int m=10,n=5;
		double a=3.5,b=2.6;
		int [] arr = {1,2,3,4,5,6};
		
		//方法名相同，参数列表不同
		System.out.println("整数之和："+math.plus(m,n));
		System.out.println("小数之和："+math.plus(a,b));
		System.out.println("数组元素之和："+math.plus(arr));
	}

}
