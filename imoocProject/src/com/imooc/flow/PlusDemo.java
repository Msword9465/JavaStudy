package com.imooc.flow;

public class PlusDemo {

	public static void main(String[] args) {
		// 累积和
		int n = 1;
		int sum = 0;
		while (n <= 5) {
			sum += n;
			n++;
		}
		System.out.println("累计和为："+sum);
	}

}
