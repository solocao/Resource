package cn.itcast.day07.demo03;

import java.util.ArrayList;

/*
 * ���Ϸ��ͱ������������ͣ������ǻ������͡�
 * ���һ���洢�������ݣ���ô��Ҫʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ��ȫ��λ��java.lang���£���8�֣�
 * 
 * ��������	��Ӧ�İ�װ��
 * byte		Byte
 * short	Short
 * int		Integer		�����⡿
 * long		Long
 * float	Float
 * double	Double
 * char		Character	�����⡿
 * boolean	Boolean
 * 
 * ��JDK 1.5��ʼ���������Ϳ��ԺͶ�Ӧ�İ�װ������Զ�װ����䡣
 * װ�䣺�������� --> ��װ��
 * ���䣺��װ�� --> ��������
 */
public class Demo04ArrayListWrapper {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		int result = list.get(1);
		System.out.println(result); // 200
	}

}
