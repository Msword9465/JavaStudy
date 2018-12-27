package com.imooc.animal;
/**
   * 宠物猫类
 * @author SCUTYJ
 *
 */

public class Cat {
	
	// 成员属性：昵称、年龄、体重、品种
	String name;//数据类型默认值null
	int month;// 数据类型默认值0
	double weight;// 数据类型默认值0.0
	String species;// 数据类型默认值null
	
	// 构造方法必须与类名一致
	public Cat() {
		System.out.println("我是无参数构造方法");
	}
	
	public Cat(String name, int month, double weight, String species) {
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
	}
	
	// 成员方法：跑动
	public void run() {
		this.eat();
		System.out.println("小猫快跑");
	}
	
	// 方法重载
	public void run(String name) {
		System.out.println("小猫"+name+"快跑");
	}
	
	public void eat() {
		System.out.println("小猫吃鱼");
		
    
	}
	
	
}
