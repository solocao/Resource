package cn.itcast.day08.demo04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��Ŀ��
 * ����һ���෴�����ļ��е��ַ����ı���ȡ�����ϵ��У�����ÿһ���ı���Ϊ�����е�һ���ַ���Ԫ�ء�
 * 
 * ���裺
 * 1. ��Ҫ���ļ�����ô����ʹ�ã�FileReader��BufferedReader
 * 2. Ϊ�����ܸ��ߣ������˭��BufferedReader��ֻ��BufferedReader���У�
 * 3. ��Ҫ��һ����������Ŷ�ȡ�������ַ�����ArrayList<String>
 * 4. ��ȡһ�У�readLine
 * 5. ���������ַ�����ӵ����ϵ��У�add
 * 6. ����4-5������һ��ѭ���Ĺ��̣���ȡ�õ�null��Ҫֹͣ��
 * 7. �ر�����
 * 8. �������ϣ��鿴�����ַ���Ԫ�ص����ݡ�
 */
public class Demo02FromFileToList {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("��ϰ1.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String line; // ����һ���ַ���
		while ((line = br.readLine()) != null) {
			list.add(line); // ����ȡ�õ���һ���ַ��������������ϵ���
		}
		br.close(); // �ر���
		// ��������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
