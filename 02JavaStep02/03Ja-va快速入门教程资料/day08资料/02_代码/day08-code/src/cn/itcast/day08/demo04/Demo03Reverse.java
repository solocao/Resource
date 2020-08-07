package cn.itcast.day08.demo04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��ת��ͷ��ʫ��
 * 
 * ������
 * 1. �϶���Ҫ��ȡ�ļ������Դ���һ��BufferedReader��
 * 2. ����һ�����ϣ�����������еľ��ӣ�ArrayList<String>
 * 3. �����Ҫadd����ȡһ����ҪreadLine
 * 4. Ҫ�����д����һ���ļ����У����ⴴ��һ��BufferedWriter
 * 5. ����������ϡ�forѭ��������i���Ǵ�0��ʼ�����Ǵ�.size() - 1��ʼ��
 * 6. �ڵ���������ϵ�ʱ�򣬵�ǰ�ַ���д���ļ��У�write
 * 7. ��Ҫ���ǻ��У�newLine
 * 8. �ر���
 */
public class Demo03Reverse {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("��ϰ2-�����-֮ǰ.txt"));
		ArrayList<String> list = new ArrayList<>();
		
		String line; // ����һ���ַ���
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close(); // �ر�������
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("��ϰ2-�����-֮��.txt"));
		for (int i = list.size() - 1; i >= 0 ; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		bw.close();
	}

}
