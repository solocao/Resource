/*
Java���е��������ͷֳ����֣�

1. �������͡������ص㡿
	�������ͣ�	byte short int long
	�������ͣ�	float double
	�ַ����ͣ�	char
	�������ͣ�	boolean

2. �������ͣ�������Ϊ�˽⣬�Ժ�����ѧϰ��
	�ַ������ࡢ�ӿڡ����顢Lambda����
	
ע�����
����byte��short��int���͵ı�����˵��ֻҪ�Ҳ಻�������ķ�Χ���ɡ�
���Ƕ���long���͵ı�����˵���Ҳ�ֱ��д�Ͼ���һ��int���ͣ�����һ��Ҫ�к�׺��ĸL��
*/
public class Demo01DataType {
	public static void main(String[] args) {
		// ����ʹ���������Ͷ�Ӧ�ı���
		// ����һ���������裺
		// �������� ��������; // ��������
		// �������� = ����ֵ; // ��ֵ�����ұ߸����
		byte num1; // ����һ��byte���͵ı��������ƽ���num1
		num1 = 100; // ��ֵ�����Ҳ�ĳ���100���������ı���num1���д洢
		System.out.println(num1); // 100
		
		num1 = 108; // �ı��˱���num1���е�����
		System.out.println(num1); // 108
		
		// ��������һ�����裺
		// �������� �������� = ����ֵ; // ����������ͬʱ�����̸�ֵ
		byte num2 = 90; // �Ҳ���и�ֵ����ֵ�����ܳ��������������ͷ�Χ
		System.out.println(num2); // 90
		
		// byte num3 = 128; // ����д����������byte�ķ�Χ��-128~127
		
		short num4 = 30000;
		System.out.println(num4); // 30000
		
		int num5 = 1800000000; // 18����
		System.out.println(num5); // 1800000000
		
		// ע�⣡�Ҳ���һ��int���͵ĳ���������ֱ��д�Ͼͳ�����21����
		long num6 = 4200000000L; // 42����
		System.out.println(num6);
		
		// �Ҳ���һ����������Ĭ����double���ͣ����������float����
		// float num7 = 3.14; // ����д����
		float num8 = 3.14F; // �ұߴ��к�׺F�ģ������ұ���float����
		System.out.println(num8); // 3.14
		
		double num9 = 2.5;
		System.out.println(num9); // 2.5
		
		char zifu1 = 'A';
		System.out.println(zifu1); // A
		
		char zifu2 = '��';
		System.out.println(zifu2); // ��
		
		boolean var1 = true;
		System.out.println(var1); // true
		
		boolean var2 = false;
		System.out.println(var2); // false
		
		// boolean var3 = 0; // ����д����ֻ����true��false����ȡֵ��д�����ģ������
		
		// ���ʹ���ַ������͵ı����أ�
		// �ַ�������д���ǣ�String�����ǹؼ��֣�
		
		// ��������ʹ�ñ���
		String str1;
		str1 = "Hello";
		System.out.println(str1); // Hello
		
		// һ������ʹ�ñ���
		String str2 = "World";
		System.out.println(str2); // World
	}
}