package cn.itcast.day07.demo01;

/*
 * ��Ȼ˵�ַ�������һ��������ô������������Ҫ���ͣ�
 * 
 * 1. ����϶���һ������֮��Ӧ����ô�ַ�����Ӧ������˭��String
 * ΪʲôString����࣬����Ҫ����ֱ�Ӿ����ã�
 * 
 * ���е��඼��Ҫ��������ʹ�ã��������������
 * A. Ҫʹ�õ�Ŀ���࣬�͵�ǰ��λ��ͬһ�����¡�
 * B. Ҫʹ�õ�Ŀ���࣬λ��java.lang���£����ǲ������Ӱ����ݡ�
 * 
 * 2. ��Ȼ�ַ����Ƕ�����ôΪʲôֱ�Ӵ�ӡ�������������أ�
 * ��ӡprintln�����߼���
 * 1. ������ַ������ͣ���ôֱ����ʾ���ݡ�
 * 2. ��������ַ������ͣ���ô����취�ڲ�ת����Ϊ�ַ�����Ȼ������ʾ��
 * һ��Ķ�����ʹ�á�������Ϣ+@+��ֵַ����Ϊ�ַ������ݵġ�
 */
public class Demo02StringQuestion {
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str); // Hello
		
		Person per = new Person();
		System.out.println(per); // cn.itcast.day07.demo01.Person@424c0bc4
	}

}
