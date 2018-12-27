package com.imooc.flow;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		// 
		int number = (int)(Math.random()*100+1);
		int guess;
		System.out.println("请输入1-100之间的数");
		do {			
			Scanner sc1 = new Scanner(System.in);
			guess = sc1.nextInt();
			if (guess < number)
				System.out.println("太小");
			else if (guess > number)
				System.out.println("太大");
		} while (guess != number);
		System.out.println("猜对了，游戏结束");
	}

}
