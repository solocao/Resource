package cn.itcast.day05.demo01;

/*
 * �������Ƶ��������⣺
 * 1. �����������ܲ��ܺͷ���������һ�������ԡ�
 * 2. ���������������ÿһ���������ж���һ��ͬ���ı������Ƿ���ԣ����ԣ���Ȼ����һ��������������������
 */
public class Demo05Names {
	
	public static void main(String[] args) {
		int result = 100; // main�������еı���
		System.out.println("main���е�result��" + result); // 100
		
		int sum = sum(10, 20);
		System.out.println(sum); // 30
	}
	
	public static int sum(int a, int b) {
		int result = a + b;
		System.out.println("sum���е�result��" + result); // 30
		return result;
	}

}
