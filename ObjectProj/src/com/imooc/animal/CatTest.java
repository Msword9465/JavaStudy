package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		// 对象实例化
		Cat one = new Cat();// 先声明了对象，new关键字在堆中开辟内存空间
		// Cat two = one;// 指向同一内存空间

		one.setName("花花");
		one.setMonth(2);
		one.setSpecies("英国短毛猫");
		one.setWeight(1000);
//		one.price = 2000;
		Cat.price = 2000;
		System.out.println("昵称：" + one.getName());
		System.out.println("年龄：" + one.getMonth());
		System.out.println("体重：" + one.getWeight());
		System.out.println("品种：" + one.getSpecies());
		System.out.println("价格：" + Cat.price);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Cat two = new Cat();
		two.setName("凡凡");
		two.setMonth(1);
		two.setSpecies("英国短毛猫");
		two.setWeight(100);
//		two.price = 150;
		Cat.price = 150;
		System.out.println("昵称：" + two.getName());
		System.out.println("年龄：" + two.getMonth());
		System.out.println("体重：" + two.getWeight());
		System.out.println("品种：" + two.getSpecies());
		System.out.println("价格：" + Cat.price);

	}

}
