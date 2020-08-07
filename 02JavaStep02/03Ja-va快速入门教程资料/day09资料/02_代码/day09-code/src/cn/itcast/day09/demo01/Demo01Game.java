package cn.itcast.day09.demo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ��չһ��С֪ʶ��
 * 
 * ��β��ܽ�һ���ַ���"100"ת����Ϊint����100����ʽ��
 * Integer.parseInt(String str)���������ַ���������ֵ��int���֣����Խ��ַ���ת����Ϊint���֡�
 * ������ǰ�᣺��������ַ�������ֻ�������֣���ʽ������int���֣�
 */
public class Demo01Game {
	
	public static void main(String[] args) throws IOException {
		// 1. ���ȴ���һ�����ϣ������洢���Ӣ��
		ArrayList<Hero> list = new ArrayList<>();
		
		// 2. ���ļ��������ݼӵ����ϵ��С�
		loadFileToList(list);
		
		// 3. �ж�һ�¼��ϵ�����û�����ݣ��ǲ����µģ�
		boolean isNew = list.size() == 0; // ������ϵĳ���Ϊ0��˵�������µĶ���
		System.out.println("���ǲ����¶��飺" + isNew);
		
		// ������µĶ��飬û���ˣ�����Ҫ�������������뵽���ϵ���
		if (isNew) {
			// ���÷������򼯺ϵ���������Ӣ��
			addFiveHeros(list);
		}
		// ������鲻���µģ��Ѿ������ˣ��Ͳ���Ҫ�����ˡ�
		
		System.out.println("���Ƕ���������ǣ�");
		// �������ϣ�������е�ÿһ������ľ�����Ϣ
		showHeros(list);
		
		// ͳ��һ���ܺ�ս�����Ƕ��١�
		int totalAttack = getTotalAttack(list); // ���ݼ��ϵ���������ܹ�����
		System.out.println("���Ƕ������ս�����ǣ�" + totalAttack);
		
		// �ж�һ�¼����ǲ����µ�
		if (isNew) {
			saveToFile(list); // ���÷��������ϵ���Ϣд���ļ��С�
		}
		// ������ϲ����µģ����Ǵ��ļ��м��صõ������ݣ���ʲô��������
		System.out.println("�˳���Ϸ");
	}
	
	/*
	 * ����һ��������������ȡ�ļ�����������ӵ����ϵ��С���Ҫ�أ�
	 * ����ֵ���ͣ������������������ͣ���ʽ�����Ĳ�����Ӱ��ʵ�ʲ���������void
	 * �������ƣ�loadFileToList
	 * �����б�ArrayList<Hero>
	 */
	public static void loadFileToList(ArrayList<Hero> list) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("friends.txt"));
		
		String line; // ����һ���ַ���
		while ((line = br.readLine()) != null) {
			// ��Ҫ���ַ���ת����Ϊһ��Hero����
			// ���Ƚ�һ���������ַ����зֳ�Ϊ����С�ζ�
			String[] array = line.split(",");
			String name = array[0]; // ����
			// ���ַ���ת����Ϊ��Ӧ��int������������
			int attack = Integer.parseInt(array[1]); // ������
			String type = array[2]; // ����
			// ����������Ϣ����һ��Ӣ�۶���
			Hero hero = new Hero(name, attack, type);
			list.add(hero); // ��������ӵ����ϵ���
		}
		
		br.close(); // ��Ҫ���ǹر���
	}
	
	/*
	 * ����һ�����������������ϵ��еĶ�������ȫ��д���ļ����Ҫ�أ�
	 * ����ֵ���ͣ�void
	 * �������ƣ�saveToFile
	 * �����б�ArrayList<Hero>
	 */
	public static void saveToFile(ArrayList<Hero> list) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("friends.txt"));
		
		// �������ϣ�һ������һ������ذ�����д
		for (int i = 0; i < list.size(); i++) {
			Hero hero = list.get(i); // ��ǰӢ��
			// ��Ҫ��һ��Hero����ת����Ϊ�ַ�������������Ա����ƴ�ӳ�Ϊһ���ַ���
			// ����,200,����
			// �������,14000,�̿�
			// ������300,500,����
			String str = hero.getName() + "," + hero.getAttack() + "," + hero.getType();
			// ����Ӧ���ַ���д���ļ���
			bw.write(str);
			bw.newLine(); // ��Ҫ���ǻ���
		}
		
		// ���ر���
		bw.close();
	}
	
	/*
	 * ����һ���������������ݼ������ս������ֵ����Ҫ�أ�
	 * ����ֵ���ͣ�int���������ܺ�
	 * �������ƣ�getTotalAttack
	 * �����б�ArrayList<Hero>
	 */
	public static int getTotalAttack(ArrayList<Hero> list) {
		int total = 0; // �����ܹ�����
		for (int i = 0; i < list.size(); i++) {
			Hero hero = list.get(i);
			// ��ÿ��Ӣ�۵�ս����ȫ���ۼӵ�total����
			total += hero.getAttack();
		}
		return total;
	}
	
	/*
	 * ����һ�������������������ϵ������ж������Ϣ����Ҫ�أ�
	 * ����ֵ���ͣ�ֻ�ǽ��д�ӡ������ѣ�����ʹ��void
	 * �������ƣ�showHeros
	 * �����б�ArrayList<Hero>
	 */
	public static void showHeros(ArrayList<Hero> list) {
		for (int i = 0; i < list.size(); i++) {
			Hero hero = list.get(i); // ��ǰӢ��
			System.out.println("Ӣ�����֣�" + hero.getName() + "����������" + hero.getAttack() + "�����ͣ�" + hero.getType());
		}
	}
	
	/*
	 * ����һ�������������򼯺ϵ��������λӢ�ۡ���Ҫ�أ�
	 * ����ֵ���ͣ������������������ͣ���ʽ�����Ĳ�����Ӱ��ʵ�ʲ��������Բ���Ҫ����ֵ��void
	 * �������ƣ�addFiveHeros
	 * �����б�ArrayList<Hero>
	 */
	public static void addFiveHeros(ArrayList<Hero> list) {
		// Ӣ����Ϣ�����ڼ������루Scanner��
		Scanner sc = new Scanner(System.in); // ����һ��Scanner�������м�������
		
		for (int i = 1; i <= 5; i++) { // ѭ��5��
			// ��������Ӣ�۵�������Ϣ
			System.out.println("�������" + i + "λӢ�۵�������");
			String name = sc.next(); // ��ȡ�ַ���
			System.out.println("�������" + i + "λӢ�۵Ĺ�������");
			int attack = sc.nextInt(); // ��ȡint����
			System.out.println("�������" + i + "λӢ�۵����ͣ�");
			String type = sc.next();
			
			Hero hero = new Hero(name, attack, type); // ����һ��Ӣ�۶���
			list.add(hero); // ��Ӣ�۶�����ӵ����ϵ���
		}
	}

}
