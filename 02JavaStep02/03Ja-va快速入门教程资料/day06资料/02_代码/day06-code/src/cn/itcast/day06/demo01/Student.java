package cn.itcast.day06.demo01;

/*
 * ����һ���࣬����ģ����ʵ���ѧ������
 * 
 * ѧ��������������ɲ��֣�
 * ���ԣ�����������
 * ��Ϊ���Է���˯����ѧϰ
 * 
 * ��Ӧ���൱��Ҳ��������ɲ��֣�
 * ��Ա���������ԣ���
 * 		String name; // ����
 * 		int age; // ����
 * ��Ա��������Ϊ����
 * 		public void eat() {...} // �Է�
 * 		public void sleep() {...} // ˯��
 * 		public void study() {...} // ѧϰ
 */
public class Student {
	
	// ��Ա����
	String name; // ����
	int age; // ����
	
	// ��Ա����
	public void eat() {
		System.out.println("�Է�����");
	}
	
	public void sleep() {
		System.out.println("˯������");
	}
	
	public void study() {
		System.out.println("ѧϰ��");
	}

}
