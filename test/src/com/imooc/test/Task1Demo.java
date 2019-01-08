package com.imooc.test;

import java.util.Scanner;

//mac运行测试
public class Task1Demo {
	// 插入数据
	public int[] insertData() {
		int[] arr;
		arr = new int[10];
		for (int n=1;n<10;n++) {
			System.out.println("请插入第"+n+"个数据:");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			arr[n-1] = num;
		}
		return arr;
	}
	
	// 打印整个数组
	public void printArray(int[] arr) {
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("目前的数组元素为：");
		for (int n:arr) {
			if (n !=0)
				System.out.print(n+" ");		
		}
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~");
	}
	
	// 在数组指定位置插入数据
	public int[] insertAtArray(int[] arr,int n, int k) {

		int[] arr2 = new int[10];
		for (int i=1 ;i<k; i++) {
			arr2[i-1] = arr[i-1];
		}
		arr2[k-1] = n;
		for (int j=k+1;j<=10;j++) {
			arr2[j-1] = arr[j-2];
		}
		return arr2;
	}
	
	// 查询能被3整除的数据
	public void divThree(int[] arr) {
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("能被3整除的元素有:");
		for (int n:arr) {
			if ((n!=0) & (n%3==0))
				System.out.print(n+" ");
		}
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~");
	}
	
	// 显示提示信息
	public void notice() {
		System.out.println("***************************");
		System.out.println("          1--插入数据                     ");
		System.out.println("          2--显示数据                     ");
		System.out.println("          3--指定位置插入数据                     ");
		System.out.println("          4--显示能被3整除数据                     ");
		System.out.println("          0--退出                     ");
		System.out.println("***************************");
		System.out.println("请输入对应的数字进行操作：");
	}
	public static void main(String[] args) {
		// 主方法
		Task1Demo td1 = new Task1Demo();
		int[] arr = new int[10];
				
		while (true) {
			td1.notice();			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice==0) {
				System.out.println("已退出操作");
				break;
			}else {
				switch(choice) {
				case 1:
					arr = td1.insertData();	break;		
				case 2:
					td1.printArray(arr);break;			
				case 3:
					System.out.println("请输入要插入的元素：");
					Scanner sc1 = new Scanner(System.in);
					int n = sc1.nextInt();
					System.out.println("请输入要插入位置：");
					Scanner sc2 = new Scanner(System.in);
					int k = sc2.nextInt();
					arr = td1.insertAtArray(arr,n,k);
					break;
				case 4:
					td1.divThree(arr);break;
				}
			}

		}


		
	}

}

