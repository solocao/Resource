package cn.itcast.day08.demo02;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader�������ı��ļ����е��ַ���ȡ�������С�
 * 
 * ʹ�õĲ��裺
 * 1. ����
 * import java.io.FileReader;
 * 
 * 2. ���������췽����
 * public FileReader(String fileName)��������Ȼ���ļ���·������
 * FileReader fr = new FileReader("fileXxx.txt");
 * ���ָ�����ļ�����Ӧ���ļ������ڣ���ô����ֱ�ӱ���
 * 
 * 3. ʹ�ã���Ա������
 * ��ȡ�����ַ���public int read()����ȡ��һ���ַ����õ���Ӧ��ASCII��Unicodeֵ��
 * �ر��ͷ���Դ��public void close()
 * 
 * ʹ��FileReader�Ĳ���Ҳ�������֣����������ء�
 */
public class Demo01FileReader {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file06.txt"); // ����
		
		// ����ֵ�Ƕ�ȡ���ĵ����ַ�����Ӧ��ASCII������Unicode��ֵ
		int ch = fr.read();
		System.out.println(ch); // 97, a
		
		ch = fr.read();
		System.out.println(ch); // 98, b
		
		ch = fr.read();
		System.out.println(ch); // 99, c
		
		ch = fr.read();
		System.out.println(ch); // -1������û�и����ַ����Զ�ȡ
		
		ch = fr.read();
		System.out.println(ch); // -1������û�и����ַ����Զ�ȡ
		
		fr.close(); // �ر�
	}
	
}
