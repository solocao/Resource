package cn.itcast.day06.demo05;

public class Demo02Constructor {
	
	public static void main(String[] args) {
		// �����޲����Ĺ��췽������������
		Student one = new Student();
		
		// �����в����Ĺ��췽������������
		Student two = new Student(18);
		System.out.println("============");
		
		Student stu = new Student();
		stu.setName("����ӱ");
		stu.setAge(20);
		System.out.println("������" + stu.getName() + "�����䣺" + stu.getAge());
		System.out.println("============");
		
		// ֱ����new��ʱ��ͨ�����췽������Ա������ֵ
		Student stu2 = new Student("����", 18);
		System.out.println("������" + stu2.getName() + "�����䣺" + stu2.getAge());
		// �ı��Ա������ֵ
		stu2.setAge(19);
		System.out.println("������" + stu2.getName() + "�����䣺" + stu2.getAge());
	}

}
