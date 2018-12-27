package com.imooc.operator;

public class MathDemo1 {
	
	//自增自减运算符
	public static void main(String[] args) {
	//x++
	int x=4;
	int y=(x++)+5;
	System.out.println("x="+x+",y="+y);
	//++x
	x=4;
	y=(++x)+5;
	System.out.println("x="+x+",y="+y);
	//x--
	x=4;
	y=(x--)+5;
	System.out.println("x="+x+",y="+y);
	//--x
	x=4;
	y=(--x)+5;
	System.out.println("x="+x+",y="+y);
}

}
