package cn.itcast.day06.demo03;

/*
 * ��������������Person��ʱ�����е�age���䲻Ӧ��Ϊ����������ȴ�޷���������ȡֵ��Χ�����ݲ���ȫ��
 * 
 * ���������ʹ��private�ؼ��֡�
 * һ��ʹ����private�ؼ��ֶԳ�Ա���������Σ���ô�����˱��෶Χ֮�⣬�Ͳ���ֱ�ӷ����ˡ�
 * �����Ҫʹ��private���εĳ�Ա����������ʹ�á���ӷ��ʡ���
 * Ϊprivate��Ա������дһ�Զ�Setter Getter������
 */
public class Person {
	
	// ��Ա����
	String name; // ����
	private int age; // ����
	
	// ��Ա����
	public void show() {
		System.out.println("�ҽ�" + name + "������" + age + "�ꡣ");
	}
	
	// ר�Ŷ�����һ����Ա�����������ó�Ա���������ݣ�Setter����
	public void setAge(int num) {
		// ���������жϽ������ݺ����Լ�⣬�ѹأ�
		if (num < 0 || num > 200) {
			System.out.println("���ݴ���");
		} else {
			age = num;
		}
	}
	
	// ר�Ŷ�����һ����Ա����������ȡ��Ա���������ݣ�Getter����
	public int getAge() {
		return age;
	}

}
