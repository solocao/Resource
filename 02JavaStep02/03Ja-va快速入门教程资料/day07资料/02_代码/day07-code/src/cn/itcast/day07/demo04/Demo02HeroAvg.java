package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo02HeroAvg {
	
	public static void main(String[] args) {
		// ����һ�����ϣ�����һ�����飬������5��Ӣ��
		ArrayList<Hero> team = new ArrayList<>();
		
		// ����5��Ӣ�۶���
		Hero one = new Hero("���ļ�", 200);
		Hero two = new Hero("����", 250);
		Hero three = new Hero("���ʽ�", 360);
		Hero four = new Hero("����̫һ", 150);
		Hero five = new Hero("����", 220);
		
		// ��5��Ӣ�۶�����ӵ�������
		team.add(one);
		team.add(two);
		team.add(three);
		team.add(four);
		team.add(five);
		
		// ��Ҫ���㼯�ϵ���5��Ӣ��ƽ��ս������
		// ��μ���ս������ƽ��ֵ��
		// 1. ��Ҫ����ܺͣ�Ҳ����5��ս�������
		// 2. ��ս�������ܺͳ���5���õ�ƽ��ս����
		
		int total = 0; // ս�����ܺ�
		for (int i = 0; i < team.size(); i++) {
			// ��ȡ��ǰӢ��
			Hero hero = team.get(i);
			int attack = hero.getAttack(); // ��ȡ��ǰӢ�۵�ս����
			total += attack; // ��ս�����ۼӵ�total����
		}
		
		int avg = total / 5;
		System.out.println("ƽ��ս������" + avg);
	}

}
