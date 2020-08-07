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
public class Demo01ArrayList {
	
	public static void main(String[] args) {
		// ���ȴ���һ�����ϣ�Ȼ�����ָ����ʽ���ַ���
		ArrayList<String> recordList = new ArrayList<>();
		recordList.add("����ӱ,98");
		recordList.add("¹��,95");
		recordList.add("��С��,87");
		
		// Ӧ�ò��һ��ÿ���ַ�����ֻҪ���ź����
		ArrayList<String> scoreList = new ArrayList<>(); // ����Ķ���ַ����ǣ�"98"��"95"��"87"
		for (int i = 0; i < recordList.size(); i++) {
			String record = recordList.get(i); // ��ǰ�ַ�����"����ӱ,98"
			String[] array = record.split(",");
			String score = array[1]; // "98"
			scoreList.add(score);
		}
		
		
		// ���ַ���"98"ת����Ϊint����98
		ArrayList<Integer> numList = new ArrayList<>(); // ����Ķ�������ǣ�98��95��87
		for (int i = 0; i < scoreList.size(); i++) {
			String score = scoreList.get(i); // "98"
			int num = Integer.parseInt(score);
			numList.add(num);
		}
		
		// ����һ�£�ɸѡ��ֻҪ����90�ģ�С�ڵ���90�Ĳ�Ҫ
		ArrayList<Integer> resultList = new ArrayList<>(); // ���ս������
		for (int i = 0; i < numList.size(); i++) {
			int num = numList.get(i); // 98
			if (num > 90) {
				resultList.add(num);
			}
		}
		
		// ���������ս�����ϣ���ӡ���
		for (int i = 0; i < resultList.size(); i++) {
			int result = resultList.get(i);
			System.out.println(result);
		}
	}

}
