package cn.itcast.day06.demo06;

/*
 * ��ζ���һ������׼���ࡱ��
 * 
 * 1. ���еĳ�Ա��������Ҫʹ��private�ؼ���˽�л���
 * 2. Ϊÿһ����Ա������дһ�Զ�Getter Setter������
 * 3. ��дһ���޲����Ĺ��췽����
 * 4. ��дһ��ȫ�����Ĺ��췽����
 * 
 * POJO��Plain Old Java Object
 */
public class Student {

	// ��Ա����
	private String name; // ����
	private int age; // ����

	// �޲����Ĺ��췽��
	public Student() {
	}

	// ȫ�����Ĺ��췽��
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters Setter
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
