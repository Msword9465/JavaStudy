package com.imooc.array;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		// 冒泡法排序

		int[] a = { 34, 53, 12, 32, 56, 17 };
		System.out.println("排序前的数组为：");
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();

		// 冒泡法的趟数
		for (int i = 0; i < a.length - 1; i++) {
			// 两两比较，较大值后移
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			// 打印每一趟排序的结果
			System.out.println("第" + (i + 1) + "次冒泡排序结果：");
			for (int m : a)
				System.out.print(m + " ");
			System.out.println();
//		System.out.println("第"+(i+1)+"次冒泡排序结果：");	
//		System.out.println(Arrays.toString(a));	
		}

		System.out.println("排序后的数组为：");
		for (int i : a)
			System.out.print(i + " ");
	}

}
