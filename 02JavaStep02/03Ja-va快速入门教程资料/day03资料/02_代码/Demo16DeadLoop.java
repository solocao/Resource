/*
��ѭ����������Զͣ��������ѭ����

��׼��ʽ��
while (true) {
	ѭ����
}

��չ��ʽ��
for (;;) {
	ѭ����
}

��ѭ��Ҳ����������ѭ������
*/
public class Demo16DeadLoop {
	public static void main(String[] args) {
		// ��ѭ���ı�׼��ʽ
		while (true) {
			System.out.println("I Love Java!");
		}
		
		
		
		// System.out.println("===================");
		// for (;/*true*/;) {
		// 	System.out.println("I Love Java Teacher!");
		// }
	}
}