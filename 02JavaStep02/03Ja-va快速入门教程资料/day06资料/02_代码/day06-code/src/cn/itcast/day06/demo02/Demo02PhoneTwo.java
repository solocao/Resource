package cn.itcast.day06.demo02;

public class Demo02PhoneTwo {
	
	public static void main(String[] args) {
		Phone one = new Phone();
		
		// ���ʳ�Ա������Ĭ��ֵ
		System.out.println(one.brand); // null
		System.out.println(one.price); // 0.0
		System.out.println(one.color); // null
		System.out.println("===================");
		
		one.brand = "ƻ��";
		one.price = 8388.0;
		one.color = "��ջ�";
		System.out.println(one.brand); // ƻ��
		System.out.println(one.price); // 8388.0
		System.out.println(one.color); // ��ջ�
		System.out.println("===================");
		
		// ���ó�Ա����
		one.call("�ǲ�˹"); // ���ǲ�˹��绰
		one.sendMessage(); // Ⱥ������
		System.out.println("====================================");
		
		Phone two = new Phone();
		System.out.println(two.brand); // null
		System.out.println(two.price); // 0.0
		System.out.println(two.color); // null
		System.out.println("===================");
		
		two.brand = "����";
		two.price = 4999.0;
		two.color = "������";
		System.out.println(two.brand); // ����
		System.out.println(two.price); // 4999.0
		System.out.println(two.color); // ������
		System.out.println("===================");
		
		two.call("ŷ��"); // ��ŷ�ʹ�绰
		two.sendMessage(); // Ⱥ������
	}

}
