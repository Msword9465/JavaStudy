package com.imooc.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// ����һ����������
		int[] intArray;
		// ����һ���ַ�������
		String[] strArray;
		// ��������
		intArray = new int[5];
		strArray = new String[10];
		// ������ͬʱ����
		float[] floatArray = new float[4];
		// ��ʼ������
		char[] ch = {'a','b','c','d'};
		System.out.println("���鳤��Ϊ"+ch.length);
		System.out.println("����ڶ���Ԫ��Ϊ"+ch[2]);
		//ѭ��Ϊ�������鸳ֵ
		for(int i=0;i<5;i++) {
			intArray[i] = i+1;
		}
		// ѭ��������������ֵ
		System.out.println("��������Ϊ"+Arrays.toString(intArray));
		for(int i=0;i<5;i++) {	
			System.out.print(intArray[i]+" ");
		}
	}

}
