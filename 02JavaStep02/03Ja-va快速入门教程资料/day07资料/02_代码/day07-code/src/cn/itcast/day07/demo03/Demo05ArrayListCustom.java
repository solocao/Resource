package cn.itcast.day07.demo03;

import java.util.ArrayList;

/*
 * ���Ͽ��Դ���κ�һ���������ͣ����������Զ����Person�����
 */
public class Demo05ArrayListCustom {
	
	public static void main(String[] args) {
		// ���ȴ�������Person����
		Person one = new Person("�����Ȱ�", 18);
		Person two = new Person("��������", 19);
		Person three = new Person("�������", 200);
		
		// ׼��һ�����ϣ�������Ŷ��Person����
		ArrayList<Person> list = new ArrayList<>();
		
		// ��������ӵ����ϵ���
		list.add(one);
		list.add(two);
		list.add(three);
		
		// ��������
		for (int i = 0; i < list.size(); i++) {
			Person per = list.get(i);
			System.out.println("������" + per.getName() + "�����䣺" + per.getAge());
		}
	}

}
