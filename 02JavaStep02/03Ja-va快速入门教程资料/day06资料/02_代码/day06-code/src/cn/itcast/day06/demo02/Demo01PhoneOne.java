package cn.itcast.day06.demo02;

/*
 * ���ʹ�ö���õ��ࣿ
 * 
 * �����һ�������������ͣ�ʹ���������Էֳ��������裺
 * 
 * 1. ����
 * �����Ҫʹ�õ�Ŀ���࣬�͵�ǰ�ࣨ����main������λ��ͬһ�����µģ���ô����ʡ�Ե�����д��
 * ������Ҫʹ��import������䡣
 * 
 * 2. ����
 * ������ ������ = new ������();
 * 
 * 3. ʹ��
 * ʹ�ó�Ա������������.��Ա������
 * ���ó�Ա������������.��Ա������(����)
 */
public class Demo01PhoneOne {
	
	public static void main(String[] args) {
		// ����Phone�ഴ����һ���ֻ���������one��
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
	}

}
