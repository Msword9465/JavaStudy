package com.imooc.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// ���������ֵ
		int[] a = { 1, 10, 32, 44, 5 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
//			else continue;
		}
		System.out.println("��������ֵΪ��" + max);
	}

}
