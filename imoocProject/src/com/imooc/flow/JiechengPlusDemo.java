package com.imooc.flow;

public class JiechengPlusDemo {

	public static void main(String[] args) {
		// ����1-ĳ����ֵ�Ľ׳˲����
		int num = 5;
		long m = 1, n = 1, sum = 0;
		for (; m <= num; m++) {
			n = m * n;
			sum += n;

		}
		System.out.println(sum);

		// Ƕ��forѭ��
		long s = 1, sum2 = 0;
		for (long i = 1; i <= num; i++) {
			s = 1;//ÿ�ζ�Ҫ����
			for (long j = 1; j <= i; j++) {
				s = s * j;//��Ž׳˼���Ľ��
			}
			sum2 += s;
		}
		System.out.println("*******");
		System.out.println("#######");
		System.out.println("%%%%%%%");
		System.out.println(sum2);
	}

}
