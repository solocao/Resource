import java.util.Scanner;

/*
��������һ�����Գɼ���0-100�������еȼ����֣�
���㣺90-100
���ã�80-90
�еȣ�70-80
����60-70
������60���£�0-60֮�䣩
*/
public class Demo04IfElseExt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����뿼�Գɼ���");
		int score = sc.nextInt(); // ��ȡ���������int���֣��ŵ�����score����
		
		if (score >= 90 && score <= 100) {
			System.out.println("����");
		} else if (score >= 80 && score < 90) {
			System.out.println("����");
		} else if (score >= 70 && score < 80) {
			System.out.println("�е�");
		} else if (score >= 60 && score < 70) {
			System.out.println("����");
		} else if (score >= 0 && score < 60) {
			System.out.println("������");
		} else { // �߽�������������߳���100
			System.out.println("���ݴ���");
		}
	}
}