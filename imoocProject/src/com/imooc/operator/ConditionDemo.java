package com.imooc.operator;

public class ConditionDemo {

	public static void main(String[] args) {
		// ���������
		int a=4,b=7;
		int max;
		max=a>b?a:b;
		System.out.println("max="+max);
		boolean b1=a>b?(3<6):(true==false);
		System.out.println("b1="+b1);
	}

}
