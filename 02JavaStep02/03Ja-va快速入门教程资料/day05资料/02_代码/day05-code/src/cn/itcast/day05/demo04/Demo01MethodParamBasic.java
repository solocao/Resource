package cn.itcast.day05.demo04;

/*
 * ʲô�������������ݡ���
 * Ҳ�����ڵ��÷�����ʱ���򷽷��ڴ���һЩ���ݵĶ�����
 * 
 * ����ʽ���������ڡ����塿������ʱ��д��С����֮�ڵĲ������������������ݵģ�
 * ���磺public static int sum(int a, int b) {...} // �����a��b���ڶ����ʱ��д�ģ���������ʽ������
 * 
 * ��ʵ�ʲ��������ڡ����á�������ʱ���������뷽��������ݣ�����ʵ�ʲ������������������ݵģ�
 * ���磺int num = sum(10, 20); // �����10��20���ڵ��õ�ʱ���뷽���ģ�����������ʵ�ʲ�����
 * �����磺
 * int x = 10;
 * int y = 20;
 * int result = sum(x, y); // �����x��yҲ���ڵ��÷�����ʱ����ģ�����Ҳ��ʵ�ʲ�����
 * 
 * �������ݵĹ����У��С�������򡿣�
 * 1. ���ڻ����������ͣ��Լ�String����˵����ʽ�����Ĳ��������᡿Ӱ��ʵ�ʲ�����
 * 2. ���������������ͣ�����String����˵����ʽ�����Ĳ������᡿Ӱ��ʵ�ʲ�����
 */
public class Demo01MethodParamBasic {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a=" + a); // 10
		System.out.println("b=" + b); // 20
		System.out.println("====================");
		
		change(a, b); // ʵ�ʲ���
		
		System.out.println("====================");
		System.out.println("a=" + a); // 10
		System.out.println("b=" + b); // 20
	}
	
	// ����һ����������������������ʮ��
	public static void change(int x, int y) { // ��ʽ����
		x *= 10; // ����ʮ��
		y *= 10; // ����ʮ��
		System.out.println("x=" + x); // 100
		System.out.println("y=" + y); // 200
	}

}
