package cn.itcast.day06.demo06;

/*
 * �������е��������ͣ�Getter�������getXxx��Setter�������setXxx��������һ��������
 * ����ǻ����������͵��е�booleanֵ����ôsetXxx���򲻱䣬��getXxx��Ҫд��isXxx����ʽ��
 */
public class Person {

	private String name; // ����
	private int age; // ����
	private boolean male; // �ǲ���ү�Ƕ���true����ү�Ƕ���false������ү�Ƕ�

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
