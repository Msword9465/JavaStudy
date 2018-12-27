package com.imooc.method;

public class ArrayDemo {
	// 打印数组元素
	public void printArray(int[] arr) {
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

	// 修改数组元素
	public void updateArray(int[] arr) {	
		System.out.print("原始数组:");
		printArray(arr);//普通方法调用不用新建对象
		arr[3] = 15;
		System.out.print("修改后数组:");
		printArray(arr);
	}
	public static void main(String[] args) {
		// 
		ArrayDemo ad = new ArrayDemo();
		int[] arr1 = {1,2,3,4,5};
		
		System.out.print("方法调用前的原始数组:");
		ad.printArray(arr1);
		
		// 数组传入方法后自身会改变
		ad.updateArray( arr1);
		System.out.print("方法调用后的原始数组:");
		ad.printArray(arr1);
		
	}

}
