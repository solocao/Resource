package cn.itcast.day08.demo02;

import java.io.FileReader;
import java.io.IOException;

/*
 * �����ȡ�ַ���һ��һ���أ���ôЧ�ʺܵ͡�
 * Ϊ�����Ч�ʣ�FileReader�ṩ������һ��������ʽ��read������
 * 
 * public int read(char[] buf)��һ�ζ�ȡ�����ַ���������ݡ�
 * ������һ���ַ����飬�������ض�ȡ���Ķ���ַ���
 * ����ֵ����������鵱�ж�ȡ������Ч������
 */
public class Demo03FileReaderArray {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file07.txt");
		
		char[] buf = new char[2]; // ����һ��һ���Կ���װ�����ַ��ĳ���������
		
		int len = fr.read(buf);
		System.out.println("len=" + len); // 2����ȡ����2����Ч�ַ�
		String str = new String(buf, 0, len); // �����ַ�����������һ���ַ���
		System.out.println("str=" + str); // he
		
		len = fr.read(buf);
		System.out.println("len=" + len); // 2����ȡ����2����Ч�ַ�
		str = new String(buf, 0, len); // �����ַ�����������һ���ַ���
		System.out.println("str=" + str); // ll
		
		len = fr.read(buf);
		System.out.println("len=" + len); // 1��ֻ��ȡ����1����Ч�ַ�
		str = new String(buf, 0, len); // ʹ���ַ����鵱�еġ���Ч���֡��������ַ���
		System.out.println("str=" + str); // ol
		
		len = fr.read(buf);
		System.out.println("len=" + len); // -1������û�и�������
		
		len = fr.read(buf);
		System.out.println("len=" + len); // -1������û�и�������
		
		fr.close();
	}

}
