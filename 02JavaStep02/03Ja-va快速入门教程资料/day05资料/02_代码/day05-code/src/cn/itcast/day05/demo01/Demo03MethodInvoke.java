package cn.itcast.day05.demo01;

/*
 * ��ε���һ������õķ�����
 * 
 * 1. ��������
 * ��ʽ����������(����ֵ);
 * ��ʹ�õ������õ�ʱ���޷�ʹ�÷����ķ���ֵ��
 * 
 * 2. ��ӡ����
 * ��ʽ��System.out.println(��������(����ֵ));
 * ���÷��������ҽ�����ֵ��ӡ��ʾ������
 * 
 * 3. ��ֵ����
 * ��ʽ���������� �������� = ��������(����ֵ);
 * ���÷��������ҽ�����ֵ����һ��������ע�⣬�������������ͱ���ͷ����ķ���ֵ���Ͷ�Ӧ��
 */
public class Demo03MethodInvoke {
	
	public static void main(String[] args) {
		// ��������
		sum(10, 20);
		System.out.println("=============");
		
		// ��ӡ����
		System.out.println(sum(100, 200));
		System.out.println("=============");
		
		// ��ֵ����
		int num = sum(15, 23);
		num += 100;
		System.out.println(num); // 138
	}
	
	public static int sum(int a, int b) {
		System.out.println("��͵ķ���ִ������");
		int result = a + b;
		return result;
	}

}
