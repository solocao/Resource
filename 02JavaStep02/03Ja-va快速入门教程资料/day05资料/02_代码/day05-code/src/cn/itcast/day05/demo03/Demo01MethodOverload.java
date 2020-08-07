package cn.itcast.day05.demo03;

/*
 * ���е�����������
 * �������ƵĶ��������ȫ����ִ����ӵĲ�����������Ϊ�����б�һ����������Ҫ��ס������֡�̫�鷳��
 * 
 * ���������
 * ʹ�÷������أ�Overload���ļ��������ԴﵽЧ����
 * �������ƹ��ܵĶ��������ֻҪ��סһ����ͬ�ķ��������ɡ����Ը��ݲ����б�Ĳ�ͬ�Զ����䡣
 * 
 * �������أ�Overload����������������ͬ�����ǲ����б�ͬ��
 * 
 * ʲô���������б�ͬ��
 * 1. �����ĸ�����ͬ��
 * 2. ���������Ͳ�ͬ��
 * 3. �����Ķ�����˳��ͬ��
 * 
 * ���������������޹أ�
 * 1. �뷵��ֵ�����޹�
 * 2. ������������޹�
 */
public class Demo01MethodOverload {
	
	public static void main(String[] args) {
//		System.out.println(sumTwo(10, 20)); // 30
//		System.out.println(sumThree(10, 20, 30)); // 60
//		System.out.println(sumFour(10, 20, 30, 40)); // 100
		
		System.out.println(sum(10, 20)); // ��������������
		System.out.println(sum(10, 20, 30)); // ��������������
		System.out.println(sum(10, 20, 30, 40)); // �ĸ�����������
		
//		System.out.println(sum(10, 20, 30, 40, 50)); // ˭���Բ��ϣ�û���κ�һ��������ʽʹ�ã����Ա���
		
		System.out.println("==============");
		
		System.out.println(sum(10, 20)); // ����int
		System.out.println(sum(10.0, 20.0)); // ����double
		System.out.println("==============");
		
		System.out.println(sum(10, 2.5)); // ��int��double
		System.out.println(sum(2.5, 10)); // ��double��int
	}
	
	public static int sum(int a, int b) {
		System.out.println("��2��int�����ķ���ִ�У�");
		return a + b;
	}
	
	// ����д�����޷����ݲ��������ƽ������ء�
//	public static int sum(int x, int y) {
//		System.out.println("��2��int�����ķ���ִ�У�");
//		return x + y;
//	}
	
	// ����д�����޷����ݷ���ֵ���͵Ĳ�ͬ�������ء�
//	public static double sum(int a, int b) {
//		System.out.println("��2��int�����ķ���ִ�У�");
//		return a + b + 0.0; // int + int + double --> double
//	}
	
	public static double sum(int a, double b) {
		// ���ʽ������Ҫ������������Ͳ�һ������ô�죿
		// ˭�����ݷ�Χ�󣬽������˭
		System.out.println("��int��double�ķ���ִ�У�");
		return a + b; // int + double --> double
	}
	
	public static double sum(double a, int b) {
		System.out.println("��double��int�ķ���ִ�У�");
		return a + b; // double
	}
	
	public static double sum(double a, double b) {
		System.out.println("��2��double�����ķ���ִ�У�");
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		System.out.println("��3��int�����ķ���ִ�У�");
		return a + b + c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		System.out.println("��4��int�����ķ���ִ�У�");
		return a + b + c + d;
	}

}
