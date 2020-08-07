package cn.itcast.day08.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedWriter��FileWriter��࣬Ҳ��һ������д�ļ����࣬�����ַ��������
 * ��������BufferedWriter��������һ������Ϊ8192��char[]�ַ����飬����������ʹ�á�
 * ÿ����д���ݵ�ʱ��ʵ���϶����ڲ��ϵ��򻺳����鵱������ַ���
 * ������������Ѿ����ˣ���ô����ͳһ��д��Ӳ�̵��ļ����С�
 * �����û��д������ô�͵ȴ���һ��д�롣
 * ������չر�����ʱ��������Ȼû������ôҲ�Ὣʣ�����Ч����д��Ӳ���ļ��
 * 
 * ���ʹ��BufferedWriter��
 * 1. ���ȴ���һ����ͨ��FileWriter
 * 2. �������ͨ��FileWriter��װ��Ϊ�����BufferedWriter���ù��췽����
 * 3. ����BufferedWriterʹ�õķ�����FileWriter����һ����
 * 
 * ���췽����
 * public BufferedWriter(FileWriter fw)����������һ����ͨ��FileWriter����
 */
public class Demo01BufferedWriter {
	
	public static void main(String[] args) throws IOException {
		// ���ȴ���һ����ͨ��FileWriter
		FileWriter fw = new FileWriter("file08.txt");
		// �������ͨ��FileWriter���󴫵ݸ�BufferedWriter���췽�����ɡ�
		BufferedWriter bw = new BufferedWriter(fw);
		// ����bw��ʱ�򣬺�fw����û������
		bw.write("Hello");
		// �ر���
		bw.close();
	}

}
