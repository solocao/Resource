package cn.itcast.day09.demo02;

/*
 * ���Ҫ��ʹ�ö���õĽӿڣ�������һ���ӿڵġ�ʵ���ࡱ��
 * ����ʵ�����ʽΪ��
 * 
 * public class ʵ�������� implements �ӿ����� {
 * 		// һ��Ҫ������д���еĳ��󷽷�
 * }
 * 
 * ʲô�Ǹ�����д��Override�����󷽷���
 * 1. ���ӿڵ��еĳ��󷽷���д����
 * 2. ȥ��abstract�ؼ���
 * 3. д�ϴ����ŷ�����
 * 
 * Cat����Animal�ӿڵ�ʵ���࣬Cat��ʵ����Animal�ӿڡ�
 */
public class Cat implements Animal {
	
	public void eat() {
		System.out.println("è����");
	}
	
	public void sleep() {
		System.out.println("è˯��");
	}
	
	// ����һ��Cat�Լ����еķ������ӿڵ��в�û�ж���
	public void catchMouse() {
		System.out.println("èץ����");
	}

}
