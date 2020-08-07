package cn.itcast.day10.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * Java 8���еġ�������ʵ����Stream�ӿڵĶ���
 * JDK�ṩ��һ�����ӿڣ�java.util.stream.Stream<T>
 * 
 * ��λ�ȡ����
 * 1. ���ݼ��ϻ�ȡ������������.stream()
 * 2. ���������ȡ����Stream.of(��������)
 */
public class Demo03GetStream {
	
	public static void main(String[] args) {
		// 1. ���ݼ��ϻ�ȡ��
		ArrayList<String> list = new ArrayList<>();
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");
		
		Stream<String> streamA = list.stream();
		
		// 2. ���������ȡ�������鵱�е�Ԫ�ر������������Ͳ���
		String[] arrayStr = { "Hello", "World", "Java" };
		Stream<String> streamB = Stream.of(arrayStr);
		
		Integer[] arrayInteger = { 10, 20, 30 };
		Stream<Integer> streamC = Stream.of(arrayInteger);
	}

}
