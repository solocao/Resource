// continue���Ļ���ʹ�ã�ֻ��������ǰ��ѭ����ʣ�����ݣ����Ͽ�ʼ��һ��ѭ����
public class Demo13Continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			// �����ǰ�ǵ�4¥����ô���������Ͽ�ʼ�����5¥
			if (i == 4) {
				continue; // ���д���һ��ִ�У���ôѭ���嵱��ʣ�����ݽ������������Ͽ�ʼ��һ��ѭ����
			}
			System.out.println(i + "¥���ˡ�");
		}
	}
}