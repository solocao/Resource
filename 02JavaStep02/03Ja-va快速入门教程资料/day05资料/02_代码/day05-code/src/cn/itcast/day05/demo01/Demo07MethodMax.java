package cn.itcast.day05.demo01;

import java.util.Scanner; // һ��Ҫд��package����

/*
 * ��Ŀ��������������int���֣�����һ��������������е����ֵ��
 * 
 * ���裺
 * 1. �����������Scanner��������������ʹ�ã�
 * 2. ���巽������Ҫ��
 * ����ֵ���ͣ����ս��һ����int����
 * �������ƣ�getMax
 * �����б�����int����
 * 3. ���÷������õ�����ֵ�����ս�����ֵ����
 * 4. ��ӡ���ս����
 * 
 * ע�����
 * �����з���ֵ�ķ��������뱣֤���ҽ���һ��return�ᱻִ�С�
 */
public class Demo07MethodMax {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ����
		
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		
		// ���÷�������ȡ����ֵ���
		int max = getMax(a, b);
		System.out.println("���ֵ��" + max);
	}
	
	public static int getMax(int x, int y) {
//		int max; // ���ֵ���
//		if (x > y) {
//			max = x;
//		} else {
//			max = y;
//		}
//		return max;
		
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

}
