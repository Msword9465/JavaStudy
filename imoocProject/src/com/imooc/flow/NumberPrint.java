package com.imooc.flow;

import java.util.Scanner;

public class NumberPrint {

	public static void main(String[] args) {
		//
		int n = 1;
		while (true) {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			if (n == 0)
				break;
			System.out.println(n);
		}

	}

}
