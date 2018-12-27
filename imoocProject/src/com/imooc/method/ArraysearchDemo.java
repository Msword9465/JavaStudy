package com.imooc.method;

import java.util.Scanner;

public class ArraysearchDemo {

	public boolean search(int n, int[] arr) {
		boolean flag = false;
		for (int i : arr) {
			if (n == i) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// 查找数组元素
		int[] arr = { 2, 5, 10, 35, 58, 98, 200 };

		System.out.println("请输入要查找的数据：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArraysearchDemo as = new ArraysearchDemo();
		boolean result = as.search(n, arr);

		if (result)
			System.out.println("找到了！");
		else
			System.out.println("没找到！");
	}
}
