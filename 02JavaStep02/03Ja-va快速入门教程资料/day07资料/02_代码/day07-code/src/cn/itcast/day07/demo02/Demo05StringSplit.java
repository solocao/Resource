package cn.itcast.day07.demo02;

/*
 * ���ϣ�����ַ�������ָ���ı���зֳ�Ϊ���ɶζ�����ô����ʹ�÷�����
 * public String[] split(String regex)����regex��Ϊ��ǽ����е��������з�֮������ɶζ��ַ������ַ������飩
 * 
 * ע�����
 * �ֽ׶�ǿ���Ƽ���Ҫʹ��Ӣ�ľ����Ϊ�ָ�ı�ǡ�
 * ��ΪӢ�ľ����������ʽ���������⺬�壬
 * ������regex��ʵ����һ��������ʽ�����ѧϰ����
 * ���һ��Ҫʹ��Ӣ�ľ�㣬�и�ı��Ӧ��ʹ��"\\."���ֽ׶εĹ̶�д����
 */
public class Demo05StringSplit {
	
	public static void main(String[] args) {
		String str1 = "AAA,BBB,CCC";
		String[] array1 = str1.split(",");
		System.out.println("����ĳ��ȣ�" + array1.length);
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("================");
		
		String str2 = "aaa.bbb.ccc";
		String[] array2 = str2.split("\\.");
		System.out.println("����ĳ��ȣ�" + array2.length);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
