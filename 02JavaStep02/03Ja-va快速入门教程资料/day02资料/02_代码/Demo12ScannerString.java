import java.util.Scanner;

/*
1. ������import java.util.Scanner;
2. ������Scanner sc = new Scanner(System.in);
3. ʹ�ã�String str = sc.next();
*/
public class Demo12ScannerString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ���ַ�����");
		String str1 = sc.next(); // ��һ������
		System.out.println("�ַ���1��" + str1);
		
		System.out.println("������ڶ����ַ�����");
		String str2 = sc.next(); // �ڶ�������
		System.out.println("�ַ���2��" + str2);
	}
}