package cn.itcast.day09.demo04;

public class Demo02CalcLambda {

	public static void main(String[] args) {
		method((x, y) -> x + y);
		// Lambda���ʽ��(x, y) -> x + y
		// method������Ҫһ��Calculator�ӿ����͵Ĳ���
		// Lambda���ʽ���ǳ䵱��Calculator�ӿ����͵Ĳ���
		// ������⣺
		// 1. Lambda���ʽǰ���С���ţ���ʵ���ǽӿڳ��󷽷���С���š�
		// 2. ��ͷ��������С���ŵ�������ʲô���飬��һ��ָ��Ķ�����
		// 3. ��ͷ����ʹ����õ��˲���֮����ʲô���顣
		// Lambda���ʽ�����屾��ʹ�������ô��������飬û�ж���ĸ��������档�����Ӽ�ֱ�ۡ���
	}

	public static void method(Calculator calculator) {
		int result = calculator.sum(100, 200);
		System.out.println("����ǣ�" + result);
	}

}
