package cn.itcast.day05.demo01;

public class Demo04MethodInvoke {
	
	public static void main(String[] args) {
		
		int num = sum(10, 20);
		System.out.println(num); // 30
	}
	
	public static int sum(int a, int b) {
		System.out.println("��͵ķ���ִ������");
		int result = a + b;
		return result;
	}

}
