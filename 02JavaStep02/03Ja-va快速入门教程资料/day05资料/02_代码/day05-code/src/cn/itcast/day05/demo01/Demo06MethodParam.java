package cn.itcast.day05.demo01;

public class Demo06MethodParam {
	
	public static void main(String[] args) {
		System.out.println(methodThree(10, 20, 30)); // 60
		System.out.println(methodOne(20)); // 120
		System.out.println(methodNone()); // 10000
	}
	
	// �����ж�������
	public static int methodThree(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	
	// ����ֻ��һ�������
	public static int methodOne(int num) {
		int result = num + 100;
		return result;
	}
	
	// û�в����������С����ֱ�����գ�
	public static int methodNone() {
		int num = 10000;
		return num;
		
//		return 10000;
	}

}
