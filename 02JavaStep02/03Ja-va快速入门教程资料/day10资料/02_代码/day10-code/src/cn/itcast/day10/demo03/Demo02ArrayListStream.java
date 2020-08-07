package cn.itcast.day10.demo03;

import java.util.ArrayList;

/*
 * ��Ŀ��
 * ��һ�����������ŵ��ַ����������磺"����ӱ,98"��"¹��,95"��"��С��, 87"
 * Ҫ���ӡ������гɼ����д���90�ֵ����֡�
 * 
 * ������
 * 1. ���ȶ���һ������ArrayList������ָ����ʽ�����ɸ��ַ�����
 * 2. ����ֻ��Ҫ���ź���ģ���ô��Ҫ�ָ��ַ�����split��Ȼ��ȡ�ý�����鵱�е�1��Ԫ��
 * 3. �����ַ����и������"98"��Ȼ��һ��String����Ҫת����Ϊint��Integer.parseInt��̬����
 * 4. Ҫ�ж�һ��ת��֮���int�ǲ��Ǵ���90��ɸѡ
 * 5. ��ɸѡ֮������ս�����д�ӡ�����
 */
public class Demo02ArrayListStream {
	
	public static void main(String[] args) {
		// ���ȴ���һ�����ϣ�Ȼ�����ָ����ʽ���ַ���
		ArrayList<String> recordList = new ArrayList<>();
		recordList.add("����ӱ,98");
		recordList.add("¹��,95");
		recordList.add("��С��,87");
		
		// Stream API����д����
		recordList.stream().map(s -> s.split(",")[1]).map(Integer::parseInt)
			.filter(n -> n > 90).forEach(System.out::println);
	}

}
