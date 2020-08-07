package cn.itcast.day08.demo03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader�����ṩ��һ�����������Զ�ȡһ�����ַ�����
 * 
 * public String readLine()����ȡһ�����ַ���������ֵ���в��������з���
 */
public class Demo04ReadLine {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file11.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		String line = br.readLine();
//		System.out.println(line); // Hello
//		
//		line = br.readLine();
//		System.out.println(line); // World
//		
//		line = br.readLine();
//		System.out.println(line); // Java
//		
//		line = br.readLine();
//		System.out.println(line); // null
//		System.out.println(line == null); // true
		
		String line; // ����һ���ַ���
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}

}
