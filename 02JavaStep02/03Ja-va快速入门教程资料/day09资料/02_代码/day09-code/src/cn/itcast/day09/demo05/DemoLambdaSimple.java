package cn.itcast.day09.demo05;

/*
 * ��Lambda���ʽ���У����ǿ����Ƶ��ģ����ǿ���ʡ�Եġ�
 * 
 * 1. Lambda���ʽ���еĲ������Ϳ���ʡ�Բ�д��
 * 2. �����������ֻ��һ������ôС���ſ���ʡ�ԡ�
 * 3. ������ֻ��һ������ô�����ź�returnҲ����ʡ�ԡ�
 */
public class DemoLambdaSimple {
	
	public static void main(String[] args) {
		// ��׼��ʽ��
		method(            (int x) -> { return ++x; }              );
		
		// ʡ�Բ������ͣ�
		method(            (x) -> { return ++x; }              );
		
		// ʡ�Բ���С���ţ�
		method(            x -> { return ++x; }              );
		
		// ʡ�Դ����ź�return�ؼ��֣�
		method(            x -> ++x              );
		
	}
	
	public static void method(MyInter inter) {
		int result = inter.singlePlus(10);
		System.out.println("�����" + result);
	}

}
