package cn.itcast.day08.demo02;

import java.io.FileReader;
import java.io.IOException;

/*
 * ע�����
 * ÿ�ε���read���������᳢�Զ�ȡ��һ�����ַ���
 * 
 * ��չһ��С���ɣ�
 * ���һ��int����ȷʵ��һ�����ֶ�Ӧ��ASCIIֵ����ô����ͨ����ʽ���䷭���Ϊ���֣�
 * (char) ��������
 */
public class Demo02FileReaderWhile {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file06.txt"); // ����
		
		// ����Ĵ�����Ϊÿ��read����ִ�У������ȡһ�����ַ���ֱ��-1Ϊֹ��
//		while (fr.read() != -1) {
//			System.out.println(fr.read());
//		}
		
		int ch; // ����һ�������ַ�����Ӧ��ASCII/Unicode��
		while ((ch = fr.read()) != -1) {
			System.out.println((char) ch);
		}
		
		// (x + y) > z
		
		fr.close(); // �ر�
	}
	
}
