/*
ʹ�ñ�����ע�����

1. �����Ķ����������������
2. �������û�и�ֵ������ֱ��ʹ�ã����Ҫ��ʹ�ã��������ȸ�ֵ��
3. ���������������⡣
�������򡿱����������ĸ������ŵ��о�ֻ��������ʹ�ã�������ֱ�������Ĵ����ţ��Ͳ���ʹ�á�
4. ����ͨ��һ������ͬʱ������������ͬ�ı�����
*/
public class Demo02Notice {
	
	public static void main(String[] args) {
		int num1 = 100; // ������һ������num1�ı���
		// int num1 = 200; // ��������һ������Ҳ��num1�ı���������д����
		int num2 = 200; // ��������һ�����ֽ���num2�ı�������ȷд����
		System.out.println(num2); // 200
		
		int num3; // ������һ������
		// num3 = 30; // û�н��и�ֵ�Ļ�
		// System.out.println(num3); // ����д����û�и�ֵ�ı�������ֱ��ʹ��
		
		// ������֮����ʵ������дһ�������
		{
			int num4 = 40;
			System.out.println(num4); // 40
		}
		// System.out.println(num4); // ����д�����Ѿ�������num4ֱ�������Ĵ����ţ�����Ͳ��������ˡ�
		// ��Ȼ�����ˣ�����û��num4�ˣ���ô�����Լ��ܲ����ٶ���һ��num4������
		int num4 = 400;
		System.out.println(num4); // 400
		
		int a, b, c; // ͬʱ��������������������ȫ����int���͡�
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a); // 10
		System.out.println(b); // 20
		System.out.println(c); // 30
		
		int x = 100, y = 200, z = 300;
		System.out.println(x); // 100
		System.out.println(y); // 200
		System.out.println(z); // 300
	}
	
	
	
}