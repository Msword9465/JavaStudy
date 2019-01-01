package com.imooc.animal;
/**
   * 宠物猫类
 * @author SCUTYJ
 *
 */

public class Cat {
	
	// 成员属性：昵称、年龄、体重、品种
	// 修改属性的可见性，只允许在当前类内部访问
	private String name;//数据类型默认值null
	private int month;// 数据类型默认值0
	private double weight;// 数据类型默认值0.0
	private String species;// 数据类型默认值null
	// 静态成员，类对象共享，
	static int price;
	
	
	// 构造方法必须与类名一致
	public Cat() {
		System.out.println("我是宠物猫");
	}	
	
//	public Cat(String name, int month, double weight, String species) {
//		this.name = name;
//		this.month = month;
//		this.weight = weight;
//		this.species = species;
//	}
	
	// 创建get\set方法
	// 添加属性限定
	public void setName(String name) {
		this.name = name;
	}
		
	public String getName( ) {
		return "我是一只名叫"+this.name+"的宠物猫";
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<=0) {
			System.out.println("输入年龄有误");
		}else {
			this.month = month;
		}
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
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
