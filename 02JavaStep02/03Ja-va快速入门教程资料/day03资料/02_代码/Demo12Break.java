// ʹ��break�����ѭ��
public class Demo12Break {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// �����ǰ�ǵ�4�Σ���ô��������ѭ��ֹͣ��
			if (i == 4) {
				break; // ���д���һ��ִ�У�����forѭ�����̽�����
			}
			System.out.println("�㰮�����ң�" + i);
		}
	}
}