import java.util.Scanner; // 1. ����
/*
1. ����
import java.util.Scanner;

2. ����
��ʽ���������� �������� = new ��������();
���룺Scanner sc = new Scanner(System.in);

3. ʹ��
��ȡһ�����������int����
int num = sc.nextInt();
*/
public class Demo11ScannerInt {
	public static void main(String[] args) {
		// 2. ����
		Scanner sc = new Scanner(System.in);
		
		// 3. ʹ�ã���ȡ���������int����
		int num = sc.nextInt();
		num += 20; // num = num + 20;
		System.out.println("�����" + num);
	}
}