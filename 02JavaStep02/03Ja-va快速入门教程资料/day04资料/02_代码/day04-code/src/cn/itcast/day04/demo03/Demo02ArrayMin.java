package cn.itcast.day04.demo03;

// ������鵱�е���Сֵ
public class Demo02ArrayMin {
	
	public static void main(String[] args) {
		// �������׵ĸ�λѡ��
		int[] array = { 5, 10, 15, 40, 30, 10000, 900, -200 };
		// ׼��һ����̨����0��Ԫ��ս���������ϳ�
		int min = array[0];
		// ������Ҫ��ÿһ��Ԫ����һ�����������д���
		// �ظ��Ĺ��̣�Ӧ��ʹ��ѭ������ʲôѭ����
		// ����ȷ����ʹ��forѭ����
		for (int i = 1; i < array.length; i++) {
			// �õ�ǰѡ��array[i]��̨�ϵ���max���б���
			if (array[i] < min) {
				min = array[i]; // ����
			}
		}
		
		System.out.println("��Сֵ��" + min);
	}

}
