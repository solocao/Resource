package cn.itcast.day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ϣ��������д�����ı��ļ����У���ô����ʹ��FileWriter�ࡣ
 * 
 * 1. ����
 * import java.io.FileWriter;
 * 
 * 2. ���������췽��
 * public FileWriter(String fileName)�������ַ��������ļ���·�����ơ�
 * FileWriter fw = new FileWriter("file01.txt");
 * �ļ���չ��ֻ�ܾ���Ĭ����ʲô������ļ������ܾ��������ݡ�
 * 
 * 3. ʹ�ã���Ա����
 * д���ݣ�public void write(String str)������������Ҫд���ļ��е��ַ�����
 * �ر�����public void close()���رգ��ͷ������Դ��
 * 
 * �ܽ�һ�£�FileWriter����ʹ�ò��裺����д���ء�
 * 
 * ע�����
 * 1. ǧ��Ҫ����������close�������йرա�
 * 2. ������ʱ�������ʾ�п������쳣����ô�������ͣ��Ȼ����Add throws...���ɡ�
 */
public class Demo01FileWriter {
	
	public static void main(String[] args) throws IOException  {
		// 1. ����һ��FileWriter����
		FileWriter fw = new FileWriter("file01.txt");
		
		// 2. ����write����д����
		fw.write("Hello, World!");
		
		// 3. ����close�����ر���
		fw.close();
	}

}
