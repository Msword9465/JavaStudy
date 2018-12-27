package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入1-7之间的数字：");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		switch (n) {
		case 1:
			System.out.println("星期一");break;
		case 2:
			System.out.println("星期二");break;
		case 3:
			System.out.println("星期三");break;
		case 4:
			System.out.println("星期四");break;
		case 5:
			System.out.println("星期五");break;
		case 6:
			System.out.println("星期六");break;
		case 7:
			System.out.println("星期日");break;
		default:
			System.out.println("超出范围");		}
	}

}
