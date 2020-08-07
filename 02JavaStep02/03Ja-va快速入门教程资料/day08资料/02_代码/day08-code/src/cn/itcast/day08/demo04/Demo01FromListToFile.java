package cn.itcast.day08.demo04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��Ŀ��
 * ����һ���������ڴ洢����ַ��������������һЩ�ַ�����
 * Ȼ�󽫼��ϵ������ַ�������д���ļ��С�Ҫ��ÿ���ַ�����ռһ�С�
 * 
 * ���裺
 * 1. ����һ�����ϣ��Ǿ��Ǵ���ArrayList
 * 2. �����洢����ַ�������ô���;���<String>
 * 3. ����ַ��������ϵ��У����ǵ��÷�����add
 * 4. ��Ȼ��Ҫд�ļ���ô���ã�FileWriter��BufferedWriter��
 * 5. ˭�����ܸ��ߣ�BufferedWriter
 * 6. ���ϵ��е�ÿһ���ַ�������Ҫ��һ����forѭ����������
 * 7. ��ѭ�����н��ַ���д���ļ������write����
 * 8. Ҫ���ַ�����ռһ�У����Ե��ã�newLine����
 * 9. ���Ҫ���ǹر�����
 */
public class Demo01FromListToFile {
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>(); // ��������
		
		// �����ַ���
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("��ϰ1.txt"));
		
		// ��������
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i); // ��ǰ�ַ���
			bw.write(str);
			bw.newLine(); // ��Ҫ���ǻ���
		}
		
		bw.close(); // ��Ҫ���ǹر���
	}

}
