package cn.itcast.day04.demo02;

/*
 * ���۶�̬���Ǿ�̬��ʼ�������鶼���г��ȡ���β��ܻ�ȡ�����أ�
 * ��ʽ��
 * ��������.length
 * ����õ�һ��int���֣���������ĳ��ȡ�
 * 
 * ��ע�⡿
 * һ������һ�����ڴ浱�б������ˣ���ô����ĳ��ȾͲ��ܷ����ı䡣
 */
public class Demo04ArrayLength {
	
	public static void main(String[] args) {
		// ��̬��ʼ��
		int[] arrayA = { 3, 6, 4, 8, 6, 9, 3, 7, 3, 10, 100 };
		System.out.println(arrayA.length); // 11
		
		// ��̬��ʼ��
		int[] arrayB = new int[25];
		int len = arrayB.length;
		System.out.println(len); // 25
	}

}
