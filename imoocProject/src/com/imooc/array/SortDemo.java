package com.imooc.array;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		// ð�ݷ�����

		int[] a = { 34, 53, 12, 32, 56, 17 };
		System.out.println("����ǰ������Ϊ��");
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();

		// ð�ݷ�������
		for (int i = 0; i < a.length - 1; i++) {
			// �����Ƚϣ��ϴ�ֵ����
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			// ��ӡÿһ������Ľ��
			System.out.println("��" + (i + 1) + "��ð����������");
			for (int m : a)
				System.out.print(m + " ");
			System.out.println();
//		System.out.println("��"+(i+1)+"��ð����������");	
//		System.out.println(Arrays.toString(a));	
		}

		System.out.println("����������Ϊ��");
		for (int i : a)
			System.out.print(i + " ");
	}

}
