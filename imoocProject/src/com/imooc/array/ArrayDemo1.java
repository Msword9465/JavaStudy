package com.imooc.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// ���ܼ�����������鲢���
		int[] a = new int[5];
		int sum=0;
		for (int i=0;i<5;i++) {
			System.out.println("�������"+(i+1)+"����:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			a[i] = n;
			sum  = a[i];
		}
        for (int i:a)
        	System.out.print(i+" ");
        System.out.println();
		System.out.println("���ܵ�����Ϊ��"+Arrays.toString(a));
		System.out.println("�����ۼӺ�Ϊ��"+sum);
	}

}
