package com.imooc.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 接受键盘输入的数组并求和
		int[] a = new int[5];
		int sum=0;
		for (int i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"整数:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			a[i] = n;
			sum  = a[i];
		}
        for (int i:a)
        	System.out.print(i+" ");
        System.out.println();
		System.out.println("接受的数组为："+Arrays.toString(a));
		System.out.println("数组累加和为："+sum);
	}

}
