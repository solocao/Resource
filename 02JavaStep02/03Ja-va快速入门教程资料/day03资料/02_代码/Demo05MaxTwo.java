import java.util.Scanner;

/*
��Ŀ��������������int���֣�����������е����ֵ��

˼·��
1. ��Ȼ�Ǽ������룬��ô�϶�ʹ��Scanner���������裩
2. ��Ҫ�������֣�����ʹ������nextInt�����ǵ����ʹ���û�б�Ҫ�ظ���
3. ����м��֣�
���a����b����ô���ս������a�����򣨰�����aС��b��a����b���������ȡ��b��
������a��b�������ֵ���ȡ��һ��������ѡ��һ������׼��if-else��䡣
*/
public class Demo05MaxTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		
		int max; // ��������������ֵ
		if (a > b) { // a����b��ȡ��a
			max = a;
		} else { // ����ȡ��b
			max = b;
		}
		System.out.println("���ֵ��" + max);
	}
}