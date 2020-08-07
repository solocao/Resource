package cn.itcast.day10.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * ���ϣ���������н���Ԫ�صı�������������ʹ��forEach������
 * 
 * forEach(Lambda���ʽ)����˼�ǣ��������е�ÿһ��Ԫ�ض�Ҫ���в�����
 * ����Lambda���ʽ������һ���ܹ�����һ�����������Ҳ��������ݽ����Lambda��
 * 
 * ���磺
 * Lambda��		s -> System.out.println(s);
 * �������ã�	System::println
 */
public class Demo06StreamForEach {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");

		Stream<String> streamA = list.stream();
		streamA.forEach((String str) -> {
			System.out.println(str);
		});
		System.out.println("==============");
		
		list.stream().forEach((String str) -> {
			System.out.println(str);
		});
		System.out.println("==============");
		
		list.stream().forEach(str -> {
			System.out.println(str);
		});
		System.out.println("==============");
		
		list.stream().forEach(System.out::println);
	}

}
