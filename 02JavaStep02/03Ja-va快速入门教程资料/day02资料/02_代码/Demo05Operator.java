/*
������������еļӺţ�+�������ַ�����˵����������ӵ���˼���������ӵĹ��ܡ�
ʹ���ַ������͵ı�����
String str = "Hello";

ע�����
1. �κ��������ͺ��ַ����������Ӳ����������һ�����ַ�����
2. �ַ������ӵ�ʱ��Ҫע���Ⱥ�˳�����ȼ����⡣
*/
public class Demo05Operator {
	public static void main(String[] args) {
		// ������һ������str1�ı��������ַ������͵ġ�
		String str1 = "Hello";
		
		String str2 = str1 + "World";
		System.out.println(str2); // HelloWorld
		
		String str3 = "Hello" + "Java" + "!";
		System.out.println(str3); // HelloJava!
		
		String str4 = "Hello" + 30;
		System.out.println(str4); // Hello30
		
		// �������ӵõ�һ��Hello10��Ȼ����ȥ����20�����ս����Hello1020
		String str5 = "Hello" + 10 + 20;
		System.out.println(str5); // Hello1020
		
		String str6 = "Hello" + (10 + 20);
		System.out.println(str6); // Hello30
	}
}