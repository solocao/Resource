package cn.itcast.day05.demo02;

/*
 * ��Ȼ����һ����������������ı���������Ҫ��ʹ��ָ���ĸ�ʽ��
 * 
 * [10, 20, 30, 40, 50]
 * 
 * �������ܴ�ӡ֮��Ҫ���У�
 * printlnȥ�����е�lnֻдprint���ɡ���ln --> line��
 */
public class Demo04PrintArrayFormat {
	
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 65, 75, 100 };
		
		printArrayFormat(array);
	}
	
	public static void printArrayFormat(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			// ����һ�¿��ǲ������һ��Ԫ��
			// ��������һ����ôֱ����������
			// ����������һ�����򶺺ſո�
			if (i == array.length - 1) {
				System.out.println(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}

}
