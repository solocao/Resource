package cn.itcast.day10.demo02;

/*
 * JDK�����Ѿ��������ṩ����һ��java.lang.Math�࣬������һ����̬����abs�Ϳ���ʵ�������ֵ�Ĺ��ܡ�
 * ��ȻMath.abs�����Ѿ��������ֳɵ���������ô�Ҿ�û�б�Ҫ����Lambda�Լ�дһ���ˡ�
 * �Ϳ���ͨ���������ã�ֱ���ù����á�
 * 
 * ��ʽ��
 * ������::��̬������
 */
public class Demo01Abs {
	
	public static void main(String[] args) {
		method(num -> {
			int result;
			if (num >= 0) { // ���������������0����ôԭ�ⲻ��
				result = num;
			} else { // ������Ǹ�����Ӧ�ø���Ϊ��
				result = -num;
			}
			return result;
		});
		System.out.println("==================");
		
		// �������õ����壺Math�൱����һ��abs��̬�������Ѿ������ֳɵĹ��ܣ�ֱ���ù����á�
		method(Math::abs);
	}
	
	public static void method(Calculator calculator) {
		int result = calculator.getAbs(-25);
		System.out.println("����ǣ�" + result);
	}

}
