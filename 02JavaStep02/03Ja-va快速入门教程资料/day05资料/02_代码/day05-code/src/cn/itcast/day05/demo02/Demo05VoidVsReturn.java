package cn.itcast.day05.demo02;

/*
 * �Ա����������
 * 
 * 1. ����һ�����������������������Ԫ�ص��ܺ͡������������յĽ���Ƕ��١���
 * 2. ����һ����������������ӡ������Ԫ�ص��ܺ͡������Լ���ӡ�͵��ˣ����ø����ҽ������
 */
public class Demo05VoidVsReturn {
	
	public static void main(String[] args) {
		int[] array = { 3, 7, 2, 34, 243, -20, -128, 500 };
		
		// ����sumA�����������յĽ���ŵ�result���档
		int result = sumA(array);
		System.out.println("main���еõ��˽����" + result);
		
		// ֻ�ܵ�������void����
		sumB(array);
	}
	
	/*
	 * 1. ����һ�����������������������Ԫ�ص��ܺ͡�
	 * ��Ҫ��
	 * ����ֵ���ͣ���Ҫ��������ݻ��������ĵ��ô�������ʹ��int
	 * �������ƣ�sumA
	 * �����б�int[] array
	 */
	public static int sumA(int[] array) {
		int sum = 0; // ��Ǯ��
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum; // ����sum���е����ݣ��������ս����
	}
	
	/*
	 * 2. ����һ����������������ӡ������Ԫ�ص��ܺ͡�
	 * ��Ҫ��
	 * ����ֵ���ͣ�û�б�Ҫ�����յĽ�����������ô������Լ���ӡ�͵��ˡ�void
	 * �������ƣ�sumB
	 * �����б�int[] array
	 */
	public static void sumB(int[] array) {
		int sum = 0; // ��Ǯ��
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// ���sumû�б�Ҫ����main���еĵ��ô������Լ�ֱ�Ӵ�ӡ����
		System.out.println("�ܺͣ�" + sum);
	}

}
