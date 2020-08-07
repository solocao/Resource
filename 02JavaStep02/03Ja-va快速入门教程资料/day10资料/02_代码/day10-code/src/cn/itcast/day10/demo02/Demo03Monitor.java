package cn.itcast.day10.demo02;

/*
 * Lambda�ķ�����
 * 1. �õ�һ������
 * 2. ���������������println����ȥ��
 * 
 * ���⣺��ȻLambda�����õ�������ԭ�ⲻ���ؽ���printlnȥʹ�á�
 * ��ôΪʲô����ֱ�ӽ���println�����м䲻��Lambda��
 * Lambda�����ֳ������У�Ҫ�������飬���Ǵ�ӡ������ӡ�Ĺ�����println�����Ѿ����ˡ�
 * 
 * ��ʱ�򣬿���ʹ�÷������á�
 * ��չһ�㣺System.out��ʵ����һ��JDK�����Ѿ������õĶ��󣬶�println����System.out�����еĳ�Ա����
 * 
 * ������::��Ա������
 * System.out::println
 * 
 * С�ڣ�
 * 1. һ��Ҫ�к���ʽ�ӿڣ�����ʹ��Lambda��
 * 2. �����ظ���Lambda����������ʹ�÷������������м򻯡�
 */
public class Demo03Monitor {
	
	public static void main(String[] args) {
		// ����ʹ��Lambda����ӵ���println����
		useMonitor(str -> System.out.println(str));
		
		// ʹ�÷������ã�ֱ�ӽ�����println��������ȥ����
		useMonitor(System.out::println);
	}
	
	public static void useMonitor(Monitor monitor) {
		monitor.show("Hello, World!");
	}

}
