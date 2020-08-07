package cn.itcast.day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter����д���ݵķ���write��5��������ʽ��
 * 
 * public void write(int ch)�������ǵ������ֶ�Ӧ�����֣��ο�ASCII����Unicode��
 * public void write(String str)��дһ���������ַ�����
 * public void write(String str, int offset, int count)��д�ַ������е�һ�������ݡ�
 * public void write(char[] array)��дһ���������ַ����顣
 * public void write(char[] array, int offset, int count)��д�ַ����鵱�е�һ�������ݡ�
 */
public class Demo05FileWriterOverload {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file05.txt");
		
		// д�����ַ�
		fw.write(65); // A
		fw.write(66); // B
		fw.write(67); // C
		fw.write(48); // 0
		fw.write(97); // a
		// ===================
		
		// дһ���������ַ���
		fw.write("World\r\n");
		fw.write("Hello");
		// ===================
		
		// дһ���ַ������еĲ�������
		String str = "��ǰ�αؾ�˯�������Ի᳤�ߡ�";
		fw.write(str, 7, 6); // �����Ի᳤��
		// ===================
		
		char[] array = { 'J', 'a', 'v', 'a', '!' };
		// дһ���������ַ�����
		fw.write(array);
		
		// дһ���ַ�����Ĳ�������
		fw.write(array, 1, 3);
		
		fw.close();
	}

}
