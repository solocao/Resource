package cn.itcast.day10.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * ���ϣ���������е�Ԫ�ؽ��й��ˣ�����ʹ�ù��˷�����
 * 
 * filter(�ܲ���boolean�����Lambda)���������Lambda������true����ҪԪ�أ����������false����ҪԪ�ء�
 */
public class Demo05StreamFilter {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(90);
		list1.add(85);
		list1.add(60);
		
		Stream<Integer> stream1 = list1.stream().filter((Integer num) -> {
			boolean b = num > 80;
			return b;
		});
		
		Stream<Integer> stream2 = list1.stream().filter(num -> {
			boolean b = num > 80;
			return b;
		});
		
		Stream<Integer> stream3 = list1.stream().filter(num -> {
			return num > 80;
		});
		
		Stream<Integer> stream4 = list1.stream().filter(n -> n > 80);
		System.out.println("==================");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("����ӱ");
		list2.add("����ӱ");
		list2.add("��С��");
		
		Stream<String> streamA = list2.stream().filter((String str) -> {
//			boolean b = "����ӱ".equals(str);
			boolean b = str.equals("����ӱ");
			return b;
		});
		
		Stream<String> streamB = list2.stream().filter(s -> {
			boolean b = s.equals("����ӱ");
			return b;
		});
		
		Stream<String> streamC = list2.stream().filter(s -> {
			return s.equals("����ӱ");
		});
		
		Stream<String> streamD = list2.stream().filter(s -> s.equals("����ӱ"));
	}

}
