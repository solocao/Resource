package cn.itcast.day05.demo02;

/*
 * ���һ������ֻ��Ҫִ��һЩ�������ѣ���û�����յ����ݽ��Ҫ���������ô�����ô�����������û�з���ֵ�ķ�����
 * ��Ҫʹ��һ���ؼ��֣�void��
 * 
 * ����һ��û�з���ֵ�ķ�����
 * ���η� void ��������(�������� ��������) {
 * 		������
 * 		return; // ����һ��returnһ�㶼��ʡ�Բ�д��
 * }
 * 
 * ��ʽ�ĵ�����
 * 1. ����ֵ���͹̶�д�ɹؼ��֣�void
 * 2. ����returnһ������ķ���ֵ��ֻ��дreturnֱ�ӷֺ�
 * 3. ����������һ����return��ô��һ��ʡ�ԡ�
 */
public class Demo01MethodVoid {
	
	public static void main(String[] args) {
		// ��������
		printHelloWorld();
		System.out.println("=================");
		
		printHelloWorldCount(20);
	}
	
	/*
	 * ����һ��������������ӡ����̶�10��HelloWorld
	 * ��Ҫ��
	 * ����ֵ���ͣ�ֻ�ǽ�����Ļ�Ĵ�ӡ������ѣ�û�н�����ݲ���������ֵ���ͣ�ʹ��void��
	 * �������ƣ�printHelloWorld
	 * �����б�����Ҫ�κ��������Լ����ܶ�������������Բ��ò�������������
	 */
	public static void printHelloWorld() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello, World! " + i);
		}
	}
	
	/*
	 * ����һ��������������ӡ���ָ��������HelloWorld
	 * ��Ҫ��
	 * ����ֵ���ͣ���Ȼ������Ļ��ӡ��������Բ�û�н��������Ҫ�������ô�����Ȼʹ��void
	 * �������ƣ�printHelloWorldCount
	 * �����б���Ҫ֪�������Ǽ��Σ�������Ҫһ��int����
	 */
	public static void printHelloWorldCount(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println("Hello, World! " + i);
		}
	}
	
}
