package cn.itcast.day09.demo04;

/*
 * Java����ʹ��Lambda���ʽ��ǰ���ǣ������С�����ʽ�ӿڡ���
 * 
 * ������ҽ���һ�����󷽷��Ľӿڣ���������ʽ�ӿڡ�
 * 
 * ��β�������һʧ�ؼ��һ�µ�ǰ�ӿ��ǲ��Ǻ���ʽ�ӿ��أ�
 * ��һ���̶��ĸ�ʽд��public interface֮ǰһ�м��ɣ�
 * @FunctionalInterface
 * public interface ����ʽ�ӿ��� {
 * 		// ...
 * }
 */
@FunctionalInterface
public interface Calculator {
	
	int sum(int a, int b);

}
