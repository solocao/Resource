package cn.itcast.day06.demo03;

public class Demo02Person {
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.show(); // �ҽ�null������0�ꡣ
		
		person.name = "����ӱ";
//		person.age = 30; // ����д����private�����ݲ���ֱ�ӷ���
		person.setAge(25);
		
		person.show(); // �ҽ�����ӱ������25�ꡣ
	}

}
