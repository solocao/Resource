package cn.itcast.day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ��ʹ��FileWriter��ʱ��
 * 
 * 1. ���ָ�����ļ������ڣ���ô���Զ��������ļ���
 * 2. ���ָ�����ļ��Ѿ����ڣ���ô���Ḳ��д�롣
 * 3. �����ϣ�����и���д�룬����ϣ������׷�ӣ���ôҪ������һ��������ʽ�Ĺ��췽����
 * public FileWriter(String fileName, boolean append)���ڶ������������trueֵ����ô����׷��д�롣
 */
public class Demo02FileWriter {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file02.txt", true); // ��
		
		fw.write("Java"); // д
		
		fw.close(); // ��
	}

}
