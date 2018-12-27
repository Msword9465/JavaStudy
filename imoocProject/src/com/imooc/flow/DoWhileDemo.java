package com.imooc.flow;

public class DoWhileDemo {

	public static void main(String[] args) {
		// 
		int n = 1;
		int sum = 0;
		do {
			sum += n;
			n++;
		} while (n <= 5);
		System.out.println("累计和为："+sum);
	}

}
