package cn.itcast.day06.demo01;

/*
 * ���ʹ�ô����õĶ���
 * 
 * �൱���Ѿ��������������ɲ��֣���Ա��������Ա����
 * ���ԣ������ഴ�������Ķ���Ҳ�����������֡�
 * 
 * ���ʹ�ö����еĳ�Ա��������ʽ��
 * ������.��Ա������
 * ע�⣺���ڳ�Ա������˵�����û�и�ֵ����ô������һ��Ĭ��ֵ��
 * 
 * ���ʹ�ö����еĳ�Ա��������ʽ��
 * ������.��Ա������(����);
 * 
 * �ܽ᣺ͨ��������������˭�͵��˭��
 */
public class Demo03Student {
	
	public static void main(String[] args) {
		Student stu = new Student(); // ������һ��ѧ������
		
		System.out.println(stu.name); // null
		System.out.println(stu.age); // 0
		System.out.println("==============");
		
		// �ı��Ա����������ֵ
		stu.name = "¹��";
		stu.age = 20;
		System.out.println(stu.name); // ¹��
		System.out.println(stu.age); // 20
		System.out.println("==============");
		
		// �������еĳ�Ա����������name����
		String name = stu.name;
		System.out.println(name); // ¹��
		System.out.println("==============");
		
		// ʹ�ö����еĳ�Ա����
		stu.eat(); // ���óԷ��ĳ�Ա����
		stu.sleep(); // ����˯���ĳ�Ա����
		stu.study(); // ����ѧϰ�ĳ�Ա����
	}

}
