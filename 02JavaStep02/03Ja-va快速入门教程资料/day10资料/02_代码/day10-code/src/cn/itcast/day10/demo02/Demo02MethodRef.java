package cn.itcast.day10.demo02;

/*
 * �������õ���һ�ָ�ʽ��
 * 
 * ͨ���������ó�Ա��������ʽ��
 * ������::��Ա������
 */
public class Demo02MethodRef {
	
	public static void main(String[] args) {
		Cook cook = new Cook(); // ������һ����ʦ����
		
		// ������cook�����еĳ�Ա����makeFood
		method(   cook::makeFood  );
	}
	
	public static void method(Sitter sitter) {
		sitter.work("����");
	}

}
