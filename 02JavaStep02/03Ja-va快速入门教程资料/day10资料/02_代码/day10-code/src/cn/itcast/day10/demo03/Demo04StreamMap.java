package cn.itcast.day10.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * ��ȡ��֮�󣬿���ʹ��ӳ�䷽����map(����ת����Lambda���ʽ)
 * 
 * ӳ�䣺���ǽ�һ������ת����Ϊ��һ�����󣬰��϶���ӳ�䵽�¶����ϡ�
 * 
 * "����ӱ,98"	ת����Ϊ		"98"		��һ�����ַ���ת����Ϊһ�����ַ���
 * "98"			ת����Ϊ		98			��һ���ַ���ת����Ϊһ��int����
 */
public class Demo04StreamMap {
	
	public static void main(String[] args) {
		// ������ϵ��д�ŵ����ַ�������
		ArrayList<String> list = new ArrayList<>();
		list.add("100");
		list.add("200");
		list.add("300");
		
		Stream<Integer> streamA = list.stream().map((String str) -> {
			int num = Integer.parseInt(str);
			return num;
		});
		
		Stream<Integer> streamB = list.stream().map(str -> {
			int num = Integer.parseInt(str);
			return num;
		});
		
		Stream<Integer> streamC = list.stream().map(str -> {
			return Integer.parseInt(str);
		});
		
		Stream<Integer> streamD = list.stream().map(Integer::parseInt);
		
		System.out.println("========================");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("����ӱ,98");
		list2.add("¹��,95");
		list2.add("��С��,87");
		
		Stream<String> stream1 = list2.stream().map((String str) -> {
			String[] array = str.split(",");
			String result = array[1];
			return result;
		});
		
		Stream<String> stream2 = list2.stream().map(s -> {
			String[] array = s.split(",");
			String result = array[1];
			return result;
		});
		
		Stream<String> stream3 = list2.stream().map(s -> {
			String[] array = s.split(",");
			return array[1];
		});
		
		Stream<String> stream4 = list2.stream().map(s -> {
			return s.split(",")[1];
		});
		
		Stream<String> stream5 = list2.stream().map(s -> s.split(",")[1]);
	}

}
