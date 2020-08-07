package cn.itcast.day08.demo03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader��FileReader��࣬Ҳ��������ȡ�ļ���һ���ַ���������
 * ���������BufferedReader������Ҳ��һ��8192���ȵ�char[]�ַ����飬����������ʹ�á�
 * ����ȡ���ݵ�ʱ��һ���Դ�Ӳ�̵��ж�ȡ���8192���ַ����������黺�������С�
 * �ڵ���read������ʱ��ֻ�Ǵӻ����������ó����ַ�����ʹ�á�
 * ������������е��ַ�����ȡ�ա�����ô�����Զ��ٴζ�ȡ���8192���ٴη��ڻ��������С�
 * 
 * ���ʹ��BufferedReader��
 * 1. ���ȴ���һ����ͨ��FileReader
 * 2. �������ͨ��FileReader��װ��Ϊ�����BufferedReader�����췽����
 * 3. ʹ����������ͨ��FileReader����û������
 * 
 * ���췽��
 * public BufferedReader(FileReader fr)����������һ����ͨ��FileReader����
 */
public class Demo03BufferedReader {
	
	public static void main(String[] args) throws IOException {
		// ���ȴ���һ����ͨ��FileReader
		FileReader fr = new FileReader("file10.txt");
		// �����װ��Ϊ�����BufferedReader
		BufferedReader br = new BufferedReader(fr);
		
		// ��ȡ�����ַ�����ʵ���Ǵ�8192�Ļ���������ȡ�������ַ���
//		int ch; // �������ַ�
//		while ((ch = br.read()) != -1) {
//			System.out.println((char) ch);
//		}
		
		// ��ȡ�ַ����飨��ʵ���Ǵ�8192�Ļ���������һ����ȡ������ַ�ʹ�ã�
		char[] buf = new char[2]; // һ��ȡ������
		int len; // ������Ч����
		while ((len = br.read(buf)) != -1) {
			String str = new String(buf, 0, len);
			System.out.println(str);
		}
		
		br.close(); // �ر�
	}

}
