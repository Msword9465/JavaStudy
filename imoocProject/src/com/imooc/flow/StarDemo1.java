package com.imooc.flow;

public class StarDemo1 {

	public static void main(String[] args) {
		// 输出十行十列的星号
		int i = 1, j = 1;
		//外重循环控制输出几行
		while (i <= 10) {
			j = 1;
			//内重循环控制输出几个星号
			while (j <= i) {	
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
