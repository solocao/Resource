package cn.itcast.day07.demo03;

import java.util.ArrayList;

/*
 * ��Ŀ���������ϵ��е������ַ�������
 */
public class Demo03ArrayListEach {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// ��ӣ�add
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");
		
		System.out.println(list);
		
		// �������ÿһ���ַ�������
		// ���ϵĳ��Ȼ�ȡ��size()
		for (int i = 0; i < list.size(); i++) {
			// ��ȡһ����ǰԪ�أ�get(int)
			String name = list.get(i);
			System.out.println(name);
		}
	}

}
