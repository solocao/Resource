package cn.itcast.day06.demo06;

public class Demo01Student {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student(); // Ĭ���޲�������
		stu1.setName("¹��");
		stu1.setAge(20);
		System.out.println("������" + stu1.getName() + "�����䣺" + stu1.getAge());
		
		Student stu2 = new Student("���ෲ", 25);
		System.out.println("������" + stu2.getName() + "�����䣺" + stu2.getAge());
		stu2.setAge(26);
		System.out.println("������" + stu2.getName() + "�����䣺" + stu2.getAge());
		
	}

}
