package com.imooc.flow;

public class StarDemo1 {

	public static void main(String[] args) {
		// ���ʮ��ʮ�е��Ǻ�
		int i = 1, j = 1;
		//����ѭ�������������
		while (i <= 10) {
			j = 1;
			//����ѭ��������������Ǻ�
			while (j <= i) {	
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
