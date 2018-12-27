package com.imooc.animal;

public class CatTest2 {

	public static void main(String[] args) {
		// 有参数构造方法调用
		Cat one = new Cat("凡凡",2,1000,"中华田园猫");
		
		System.out.println("昵称："+one.name);
		System.out.println("年龄："+one.month);
		System.out.println("体重："+one.weight);
		System.out.println("品种："+one.species);		

	}

}
