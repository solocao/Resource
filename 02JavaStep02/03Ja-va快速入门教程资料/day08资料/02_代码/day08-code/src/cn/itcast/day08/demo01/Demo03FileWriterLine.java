package cn.itcast.day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ��β���ʵ�ֻ��е�Ч����
 * ������ʵҲ��һ���ַ������������з�����
 * 
 * Windows���еĻ��з��ǣ�\r\n	����������ַ���һ����\r��һ����\n
 * macOS���еĻ��з��ǣ�������\r��������\n
 * Linux���еĻ��з��ǣ�\n
 */
public class Demo03FileWriterLine {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file03.txt");
		fw.write("�����Ȱ�\r\n");
		fw.write("\r\n"); // ����һ��Windows���еĻ��з�
		fw.write("��������");
		fw.close();
	}

}
