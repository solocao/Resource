package cn.itcast.day09.demo02;

/*
 * ��ζ���һ�����󷽷���
 * 
 * public abstract ����ֵ���� ��������(�������� ��������);
 * 
 * ע�⣺
 * 1. �ӿ��еĳ��󷽷����������д�����ǣ�public abstract
 * 2. �ӿ��еĳ��󷽷������η�����ʡ�Բ�д��Ĭ�Ͼ��ǣ�public abstract
 * 3. ���󷽷�ֻ�з���ͷ�������з���������š�
 */
public interface Animal {
	
	// ������һ�����󷽷����Զ���
	public abstract void eat();
	
	// ��������һ�����󷽷���˯��
	// ʡ����public abstractҲ�����ǳ��󷽷�
	/*public abstract*/ void sleep();

}
