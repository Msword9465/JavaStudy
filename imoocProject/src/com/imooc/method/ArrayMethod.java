package com.imooc.method;

public class ArrayMethod {
	// 打印数组元素
	public void printArray(int[] arr) {
		for (int n:arr) {
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		// 调用方法
		int[] a= {1,2,3,4,5};
		ArrayMethod am = new ArrayMethod();
		am.printArray(a);
	}

}
