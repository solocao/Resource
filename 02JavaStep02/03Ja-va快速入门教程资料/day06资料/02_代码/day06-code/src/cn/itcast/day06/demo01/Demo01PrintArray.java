package cn.itcast.day06.demo01;

import java.util.Arrays;

/*
 * ������̣�
 * ����Ҫʵ��һ�����ܵ�ʱ�����еĲ��趼Ҫ������Ϊ������ÿһ������ϸ�ڡ�
 * 
 * �������
 */
public class Demo01PrintArray {
	
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		
		// ����ʹ��������̵�˼�룬ÿһ������ϸ�ڶ�Ҫ���Դ���
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		
		System.out.println("==================");
		
		// ʹ����������˼�룬�ﵽͬ����Ч����
		// �Լ���������ϸ�Ĳ��裬�������˰������¶���
		// ��JDK�����Ѿ��������ṩ����һ�����ߣ�����Arrays
		// ͨ��������߾Ϳ��Խ�����ת����Ϊָ����ʽ���ַ���
		
		// ���Լ�������������Arrays���Ұ�����ת����Ϊָ����ʽ���ַ���
		System.out.println(Arrays.toString(array));
	}

}
