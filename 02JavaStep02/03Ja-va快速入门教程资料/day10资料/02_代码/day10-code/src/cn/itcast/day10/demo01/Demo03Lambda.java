package cn.itcast.day10.demo01;

/*
 * ��ĳЩ����֮�£�Lambda���ʽҪ�������飬��ʵ������һ���ط��Ѿ�д���ˡ�
 * ��ô��ʱ���ͨ��Lambda���ʽ�ظ���д��ͬ�Ĵ��룬�����˷ѡ�
 * ��ô��β��ܸ����Ѿ����ڵķ����߼��أ�
 * 
 * ���Lambda���ʽ��Ҫ�������飬������һ���൱���Ѿ������ˣ���ô�Ϳ���ֱ���ù����滻Lambda��
 * �������õ�д����
 * 
 * ͨ�����������þ�̬��������ʽ��
 * ������::��̬������
 */
public class Demo03Lambda {
	
	public static void main(String[] args) {
		hireSitter(        food -> System.out.println("��" + food + "���ɿɿڵ�ʳ�")        );
		
		hireSitter(        Cook::makeFood                );
	}
	
	// ��Ӷһ����ķ����������ȥ����
	public static void hireSitter(Sitter sitter) {
		sitter.work("�ײ�");
	}

}
