import java.util.Scanner;

/*
��Ŀ��������������int���֣�Ȼ��������е����ֵ��

˼·��
1. ���ڷ�����һ�������������ݵķ��ţ�����ͬʱ�����������ݡ�
2. ��ѧ˼ά������δ֪�����⣬Ҫ����ת����Ϊ��֪�����⣬����Ĳ�⡣

���裺
1. �������a��b���е����ֵ������һ����һ����
2. ����ab���е����ֵ���м����������͵�����c���бȽϣ��Ӷ��õ����ս����

Ҳ���ǣ������޷�ͬʱ�Ƚϣ���ô�����Ƚϼ��ɡ�
*/
public class Demo06MaxThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		System.out.println("��������������֣�");
		int c = sc.nextInt();
		
		// ���ȱȽ�һ��ǰ�������ֵ���˭�󣬻��һ���м���
		int temp;
		if (a > b) {
			temp = a;
		} else {
			temp = b;
		}
		
		// �������м����͵�����c���бȽϣ��õ����ս��
		int max;
		if (temp > c) {
			max = temp;
		} else {
			max = c;
		}
		
		System.out.println("���ֵ��" + max);
	}
}