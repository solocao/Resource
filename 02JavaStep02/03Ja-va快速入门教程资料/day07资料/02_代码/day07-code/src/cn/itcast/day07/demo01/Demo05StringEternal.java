package cn.itcast.day07.demo01;

/*
 * �ַ����������ڴ浱��һ������������ô���ݲ����Ա��ı䡣
 * 
 * �ַ��������ݲ��ᷢ���ı䣬ÿ������ú����Ǳ��˵�ʱ��һ���Ǵ������µ��ַ�����
 */
public class Demo05StringEternal {
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str); // Hello
		
		str = "World";
		System.out.println(str); // World
		
		String str2 = "Love";
		str2 += "Java";
		System.out.println(str2); // LoveJava
	}

}
