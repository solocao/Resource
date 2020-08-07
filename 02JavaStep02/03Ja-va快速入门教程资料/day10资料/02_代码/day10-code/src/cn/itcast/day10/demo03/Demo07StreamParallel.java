package cn.itcast.day10.demo03;

import java.util.ArrayList;

/*
 * �����е�Ԫ������ر�࣬��ôֻ��һ��������һ�������������϶��Ƚ������Ѿ���
 * ����������е�Ԫ�أ�ʹ�ö����ͬʱ��������ǡ���������
 * 
 * ��β��ܻ�ȡ������������֧�ֲ���������������
 * .parallelStream()
 * 
 * ע�����
 * 1. ʹ�ò�����������ʱ�򣬵����м����˽���ͬʱ�����أ����ùܣ�JDK�Լ�����
 * 2. ֻҪ��ȷʹ�ã��Ͳ�����ֶ��������ͬһ��Ԫ�ص������
 * 3. ����Ѿ���ȡ��һ����ͨ��������ôֻҪ�ٵ���һ��parallel()����Ҳ���ɲ�������
 * 
 * �ܽ᣺
 * 1. ֱ�ӻ�ȡ��������.parallelStream()
 * 2. �Ѿ���ȡ����ͨ����Ȼ��������Ϊ��������.stream().parallel()
 */
public class Demo07StreamParallel {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			list.add("Hello-" + i);
		}
		
		// ����ֻ��һ����������ӡ����Ĳ���
//		list.stream().forEach(System.out::println);
		
		// ��ȡһ��������
		list.parallelStream().forEach(System.out::println);
		
		list.stream().parallel().forEach(System.out::println);
	}

}
