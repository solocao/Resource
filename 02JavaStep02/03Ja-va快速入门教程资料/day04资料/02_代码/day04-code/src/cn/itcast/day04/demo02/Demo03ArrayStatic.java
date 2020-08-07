package cn.itcast.day04.demo02;

/*
 * �����ڳ�ʼ����ʱ�򣬻�������һ�ַ�ʽ����̬��ʼ����
 * 
 * ��̬��ʼ������ֱ��ָ�����ȣ�����ֱ��ָ�������Ԫ�����ݡ�
 * ��׼��ʽ��
 * ��������[] �������� = new ��������[] { Ԫ��1, Ԫ��2, Ԫ��3, ... };
 * 
 * ��׼��ʽҲ���Բ�ֳ�Ϊ�������裺
 * ��������[] ��������;
 * �������� = new ��������[] {...};
 * 
 * ����ʽ��
 * ��������[] �������� = { Ԫ��1, Ԫ��2, Ԫ��3, ... };
 * һ��ʹ���˼���ʽ������һ��������ɳ�ʼ�������ܲ�ֳ�Ϊ�������衣
 * 
 * ע�����
 * 1. ��Ȼ��̬��ʼ��û��ָ�����ȣ�������Ȼ���Ը��ݾ���Ԫ�صĸ����Զ�����������ȡ�
 * 2. ��Ȼ����ʽ���п��Բ�дnew...��������Ȼ���ڴ浱�п��ٿռ�Ĺ��̡�
 * 3. ��Ȼֱ��ָ���˾���Ԫ�����ݣ�������Ȼ����Ĭ��ֵ���滻�Ĺ��̡�
 */
public class Demo03ArrayStatic {
	
	public static void main(String[] args) {
		// ��̬��ʼ��
		int[] arrayA = new int[3];
		arrayA[0] = 10;
		arrayA[1] = 20;
		arrayA[2] = 30;
		System.out.println(arrayA[0]); // 10
		System.out.println(arrayA[1]); // 20
		System.out.println(arrayA[2]); // 30
		System.out.println("=================");
		
		// ��̬��ʼ����һ�����裺
		int[] arrayB = new int[] { 15, 25, 35 };
		System.out.println(arrayB); // ��ֵַ
		System.out.println(arrayB[0]); // 15
		System.out.println(arrayB[1]); // 25
		System.out.println(arrayB[2]); // 35
		System.out.println("=================");
		
		// ��̬��ʼ������������Ҳ���ԣ�
		int[] arrayC;
		arrayC = new int[] { 13, 23, 33 };
		System.out.println(arrayC[0]); // 13
		System.out.println(arrayC[1]); // 23
		System.out.println(arrayC[2]); // 33
		System.out.println("=================");
		
		// ����ʽ������ʹ��һ������һ�ε�λ
		int[] arrayD = { 16, 26, 36 };
		System.out.println(arrayD[0]); // 16
		System.out.println(arrayD[1]); // 26
		System.out.println(arrayD[2]); // 36
		System.out.println("=================");
		
		// ����д��������ʽ�ľ�̬��ʼ�����ܲ�ֳ�Ϊ�������裡
//		int[] arrayE;
//		arrayE = { 10, 20, 30 };
	}

}
