package cn.itcast.day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ���������һ�ж������֣��ı��ļ�������ʵ����ľ������֣�
 * �ܹ���������ͼ�Σ�����Ϊ��������ǽ����˷��룬����Ĺ�����ǣ�
 * ASCII�����������һ�Ÿ���ı����Unicode���
 * ���߰�����ȫ��������������Ƶ����֡�
 * 
 * FileWriter�ṩ��һ��������ʽ��write����������ֱ�Ӹ�������д�ļ���
 * public void write(int ch)���������ǵ�����������Ӧ������ֵ
 */
public class Demo04FileWriterCharacter {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file04.txt");
		
		fw.write("Hello");
		fw.write(20013); // �����С�
		fw.write("��");
		fw.close();
	}

}
