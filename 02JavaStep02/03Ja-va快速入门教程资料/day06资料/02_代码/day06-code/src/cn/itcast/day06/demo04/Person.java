package cn.itcast.day06.demo04;

/*
 * ���ֲ������ͳ�Ա����������ʱ�򣬷������л���ݡ��ͽ�ԭ��ʹ�þֲ�������
 * ���ϣ������һ�£�����Ҫʹ�ø�ʽ��
 * this.��Ա������
 * 
 * this�ؼ��ֵľ������ã��������ĳ�Ա�����;ֲ��������ֿ���
 * 
 * ��չһ������
 * this�ؼ�����ʵ������ǡ���ǰ���󡱡�
 * ��סһ�仰��ͨ��˭���õķ�����˭����this��
 */
public class Person {
	
	String name; // ���Լ�������
	
	public void sayHello(String name) { // �Է�������
		System.out.println(name + "����á�����" + this.name + "��");
	}

}
