/*
continue���������壺һ��ִ�У�������ǰ��ѭ����ʣ�����ݣ����Ͽ�ʼ��һ�Ρ�
������ʲô��������ǰ��ѭ����ʣ�����ݡ���
*/
public class Demo14ContinueNotice {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i); // ������������ѭ����ʣ������
		}
		System.out.println("======================");
		
		int i = 1;
		while (i <= 10) {
			if (i == 4) {
				System.out.println("����ִ��continue���");
				continue;
			}
			System.out.println(i); // ��һ�о���ѭ����ʣ������
			i++; // �������ʽ����Ҳ��ѭ����ʣ�����ݣ�Ҳ�ᱻcontinue������
		}
	}
}