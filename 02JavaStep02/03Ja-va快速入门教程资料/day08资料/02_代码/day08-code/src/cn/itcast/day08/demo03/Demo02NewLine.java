package cn.itcast.day08.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter�����ṩ��һ�����еķ�����
 * public void newLine()�������Զ����ݲ���ϵͳ�Ĳ�ͬ��ѡ��д��\r\n������\r������\n��
 */
public class Demo02NewLine {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file09.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
//		bw.write("\r\n"); // ����д����̫�ã�һ�����˲���ϵͳ����ô��Ҫ�޸Ĵ���
		bw.newLine(); // �Զ����ݲ���ϵͳѡ���Ӧ�Ļ��з�
		bw.write("World");
		bw.close();
	}

}
