public class Demo15BreakVsContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				// break; // һ��ִ�У�����ѭ�����̽�����
				continue; // һ��ִ�У���ǰ��ѭ���������������Ͽ�ʼ��һ��ѭ����
			}
			System.out.println(i);
		}
	}
}