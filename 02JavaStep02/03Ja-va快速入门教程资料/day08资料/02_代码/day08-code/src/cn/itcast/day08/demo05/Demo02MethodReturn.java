package cn.itcast.day08.demo05;

/*
 * �����ķ���ֵ������ʲô���ͣ�
 * 
 * 1. ��������
 * 2. ����
 * 3. �ַ���
 * 4. �Զ������
 * 
 * �����������Ͷ�������Ϊ�����ķ���ֵ���͡�
 */
public class Demo02MethodReturn {
	
	public static void main(String[] args) {
		int result1 = method1();
		System.out.println(result1); // 100
		System.out.println("==================");
		
		int[] result2 = method2();
		System.out.println(result2[0]); // 10
		System.out.println(result2[1]); // 20
		System.out.println("==================");
		
		String result3 = method3();
		System.out.println(result3.replace("o", "*")); // H*w d* y*u d*?
		System.out.println("==================");
		
		Student result4 = method4();
		// ����������ӱ�����䣺20
		System.out.println("������" + result4.getName() + "�����䣺" + result4.getAge());
	}
	
	// ʹ�û���������Ϊ�����ķ���ֵ������
	public static int method1() {
		int num = 100;
		return num;
	}
	
	// ʹ������������Ϊ�����ķ���ֵ��Ҳ����
	public static int[] method2() {
		int[] array = { 10, 20 };
		return array;
	}
	
	// ʹ���ַ�����Ϊ�����ķ���ֵ��������
	public static String method3() {
		String str = "How do you do?";
		return str;
	}
	
	// ʹ���Զ��������Ϊ�����ķ���ֵ����Ȼ����
	public static Student method4() {
		Student stu = new Student("����ӱ", 20);
		return stu;
	}

}
