import java.util.Scanner;

// ��׼��if-else���
public class Demo03IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������");
		int num = sc.nextInt(); // ��ȡ���������һ��int����
		
		// ����ж�һ����������������ż����
		if (num % 2 == 0) { // ���num����2�õ���������0��˵����ż��
			System.out.println("ż��");
		} else {
			System.out.println("����");
		}
	}
}