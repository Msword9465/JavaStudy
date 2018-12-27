package com.imooc.flow;

import java.util.Scanner;

public class IntCompare {

	public static void main(String[] args) {
		// 
		System.out.println("请输入");
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		System.out.println("请输入");
		Scanner sc2=new Scanner(System.in);
		int y=sc2.nextInt();
		
		if(x!=y) {
			if(x>y) {
				System.out.println(x+"大于"+y);
			}else {
				System.out.println(x+"小于"+y);
			}
		}else {
			System.out.println(x+"和"+y+"");
		}
			
	}

}
