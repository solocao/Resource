package cn.itcast.day09.demo01;

// �Զ���һ���࣬����Ӣ��
public class Hero {

	// ��Ա����
	private String name; // Ӣ�۵�����
	private int attack; // Ӣ�۵Ĺ�����
	private String type; // Ӣ�۵�����

	public Hero() {
	}

	public Hero(String name, int attack, String type) {
		this.name = name;
		this.attack = attack;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
