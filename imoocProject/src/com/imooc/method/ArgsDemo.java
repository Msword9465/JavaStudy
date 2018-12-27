package com.imooc.method;
/**
   * 关于可变参数列表和重载的问题
 * @author SCUTYJ
 * @version 1.0
 */
public class ArgsDemo {
	
	// 可变参数列表方法, 相比其他方法最后被调用
	public void sum(int... n) {
		int sum = 0;
		for(int i:n) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}
	
	public static void main(String[] args) {
		// 
		ArgsDemo ad = new ArgsDemo();
		ad.sum(1);
		ad.sum(1,2,3);

	}

}
