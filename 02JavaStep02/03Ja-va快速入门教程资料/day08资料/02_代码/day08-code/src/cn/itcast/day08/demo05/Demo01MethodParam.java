package cn.itcast.day08.demo05;

/*
 * �����Ĳ���������ʲô���ͣ�
 * 1. ��������
 * 2. ����
 * 3. �ַ���
 * 4. �Զ������
 * 
 * ���ۣ������������Ͷ�������Ϊ�����Ĳ������͡�
 */
public class Demo01MethodParam {
	
	public static void main(String[] args) {
		method1(100);
		System.out.println("============");
		
		int[] arr = { 10, 20, 30 };
		method2(arr);
		System.out.println("============");
		
		method3("How do you do?");
		System.out.println("============");
		
		Student xueSheng = new Student("����ӱ", 20);
		method4(xueSheng);
	}
	
	// ʹ�û���������Ϊ�����Ĳ���������
	public static void method1(int num) {
		num += 20;
		System.out.println(num); // 120
	}
	
	// ʹ��������Ϊ�����Ĳ�����Ҳ����
	public static void method2(int[] array) {
		System.out.println(array[0]); // 10
		System.out.println(array[1]); // 20
		System.out.println(array[2]); // 30
	}
	
	// ʹ���ַ�����Ϊ�����Ĳ�����������
	public static void method3(String str) {
		String result = str.replace("o", "*");
		System.out.println(result); // H*w d* y*u d*?
	}
	
	// ʹ���Զ��������Ϊ�����Ĳ������������ԣ�
	public static void method4(Student stu) {
		// ����������ӱ�����䣺20
		System.out.println("������" + stu.getName() + "�����䣺" + stu.getAge());
	}

}
