public class Demo09While {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("�Ҵ�����" + i);
		}
		System.out.println("==================");
		
		int i = 1; // 1. ��ʼ�����ʽ
		while (i <= 10) { // 2. �����ж�
			System.out.println("ԭ�������������ɣ����Ϲ����գ�" + i); // 3. ѭ����
			i++; // 4. �������
		}
	}
}