package cn.itcast.day09.demo03;

public class Demo01Calc {
	
	public static void main(String[] args) {
		// ����ʹ�ýӿڵĸ�ʽ��������һ������������
		Calculator calculator = new CalculatorImpl();
		
		// �����������󽻸�method����ȥʹ��
		method(calculator);
	}
	
	// �����ǽӿ����ͣ��������ӿ�
	public static void method(Calculator calculator) {
		int result = calculator.sum(10, 20);
		System.out.println("����ǣ�" + result);
	}

}
