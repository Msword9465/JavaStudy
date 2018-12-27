package com.imooc.flow;

public class JiechengPlusDemo {

	public static void main(String[] args) {
		// 计算1-某个数值的阶乘并求和
		int num = 5;
		long m = 1, n = 1, sum = 0;
		for (; m <= num; m++) {
			n = m * n;
			sum += n;

		}
		System.out.println(sum);

		// 嵌套for循环
		long s = 1, sum2 = 0;
		for (long i = 1; i <= num; i++) {
			s = 1;//每次都要重置
			for (long j = 1; j <= i; j++) {
				s = s * j;//存放阶乘计算的结果
			}
			sum2 += s;
		}
		System.out.println("*******");
		System.out.println("#######");
		System.out.println("%%%%%%%");
		System.out.println(sum2);
	}

}
