package cn.itcast.day05.demo02;

/*
 * ����û�з���ֵ�ķ�����Ҫע�⣺
 * 
 * 1. ����ֵû�У���������Ͳ����в����������ͷ���ֵû�б�Ȼ��ϵ��
 * 2. ����returnһ������ķ���ֵ��
 * 3. ������һ���ǡ�return;����ô���Բ�д��д�벻д��ȫ��Ч��һ�㶼��ʡ�Եġ�
 * 4. ����Ҫ��û�з���ֵ�ķ�����ֻ��ʹ�õ������ã�����ʹ�ô�ӡ���û��߸�ֵ���á�
 */
public class Demo02MethodNotice {
	
	public static void main(String[] args) {
		// ��������
		printHelloWorld();
		
		// ����д�������ܴ�ӡ���ã�
//		System.out.println(printHelloWorld());
//		System.out.println(void);
		
		// ����д�������ܸ�ֵ���ã�
//		int num1 = printHelloWorld();
//		int num2 = void;
//		void num3 = void;
	}
	
	public static void printHelloWorld() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Java!");
		}
//		return 100; // ����д����
//		return;
	}

}
