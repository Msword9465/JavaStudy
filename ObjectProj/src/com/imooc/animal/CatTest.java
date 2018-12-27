package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		// 对象实例化
		Cat one = new Cat();// 先声明了对象，new关键字在堆中开辟内存空间
		Cat two = one;// 指向同一内存空间
		
		
		// 测试对象
		one.eat();
		one.run();
		one.name = "花花";
//		one.run(one.name);
		one.month = 2;
		one.weight = 1000;
		one.species = "英国短毛猫";
		
		two.name = "花花";
		two.month = 2;
		two.weight = 1000;
		two.species = "英国短毛猫";		
		
		System.out.println("昵称："+one.name);
		System.out.println("年龄："+one.month);
		System.out.println("体重："+one.weight);
		System.out.println("品种："+one.species);
		System.out.println("---------------------");
		System.out.println("昵称："+two.name);
		System.out.println("年龄："+two.month);
		System.out.println("体重："+two.weight);
		System.out.println("品种："+two.species);
	}

}
