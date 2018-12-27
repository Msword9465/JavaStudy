package com.imooc.method;

public class FacDemo {

	// 计算阶乘
	public int fac(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s *= i;
		}
		return s;
	}

	public static void main(String[] args) {
		//
		FacDemo fc = new FacDemo();
		System.out.println("5" + "!=" + fc.fac(5));
		int sum=0;
		for (int i=1;i<=5;i++) {
			int fac = fc.fac(i);
			sum += fac;
		}
		System.out.println("1!+2!+...5!=" + sum);
	}

}
