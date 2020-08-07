package cn.itcast.day07.demo03;

import java.util.ArrayList;

/*
 * ���ʹ���Ѿ������õļ����أ����õķ�����������
 * 
 * 1. ���Ԫ��
 * public boolean add(E element)���򼯺ϵ������һ��Ԫ�أ������Ǳ���ӵ�Ԫ�أ�������ֵһ����trueֵ����ɹ���
 * 
 * 2. ��ȡԪ��
 * public E get(int index)���Ӽ��ϵ��л�ȡһ��Ԫ�أ�������Ԫ����������0��ʼ��������ֵ���ǻ�ȡ�õ���Ԫ�ض���
 * 
 * 3. ��ȡ����
 * public int size()����ȡ���ϵ�Ԫ�ظ��������ϵĳ��ȣ��õ�int���֡�
 * 
 * ע�����
 * ArrayList����ֱ�Ӵ�ӡ�������ƣ��õ��Ĳ��ǵ�ֵַ���������ݣ���ʽ���������ơ�
 * ���˽�ԭ������ΪArrayList��������е�toString���������⴦�������ѧϰ����
 * 
 * ����ArrayList������˵����ӵ�add����һ���ǳɹ��ģ�����ֵ��Ȼ��true��
 * ���Ƕ��������ļ�����˵��add�����Ͳ�һ���ɹ��ˡ�
 */
public class Demo02ArrayListMethod {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list); // []
		
		// �򼯺ϵ������Ԫ�أ�add
		list.add("¹��");
		list.add("���ෲ");
		list.add("������");
		System.out.println(list); // [¹��, ���ෲ, ������]
		
		boolean success = list.add("����ͮ");
		System.out.println("���Ԫ���Ƿ�ɹ���" + success); // true
		System.out.println(list); // [¹��, ���ෲ, ������, ����ͮ]
		System.out.println("====================");
		
		String name = list.get(1); // ��ȡ��1��Ԫ��
		System.out.println(name); // ���ෲ
		System.out.println(list); // [¹��, ���ෲ, ������, ����ͮ]
		System.out.println("====================");
		
		System.out.println("���ϵĳ��ȣ�" + list.size()); // 4
		list.add("����ӱ");
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������"); 
		System.out.println("���ϵĳ��ȣ�" + list.size()); // 8
	}

}
