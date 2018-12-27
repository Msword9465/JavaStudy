package com.imooc.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// 声明一个整形数组
		int[] intArray;
		// 声明一个字符串数组
		String[] strArray;
		// 创建数组
		intArray = new int[5];
		strArray = new String[10];
		// 声明的同时创建
		float[] floatArray = new float[4];
		// 初始化数组
		char[] ch = {'a','b','c','d'};
		System.out.println("数组长度为"+ch.length);
		System.out.println("数组第二个元素为"+ch[2]);
		//循环为整形数组赋值
		for(int i=0;i<5;i++) {
			intArray[i] = i+1;
		}
		// 循环输出整形数组的值
		System.out.println("整形数组为"+Arrays.toString(intArray));
		for(int i=0;i<5;i++) {	
			System.out.print(intArray[i]+" ");
		}
	}

}
