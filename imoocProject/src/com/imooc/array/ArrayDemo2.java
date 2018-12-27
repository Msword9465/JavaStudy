package com.imooc.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 求数组最大值
		int[] a = { 1, 10, 32, 44, 5 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
//			else continue;
		}
		System.out.println("数组的最大值为：" + max);
	}

}
