package cn.itcast.day04.demo02;

/*
 * ��η������鵱�е�Ԫ�أ�
 * 
 * ���ֱ�Ӵ�ӡ��������ƣ���ô���׵���16���Ƶĵ�ֵַ���Ĺ�ϣֵ����
 * 
 * �����ƣ�01
 * 10���ƣ�0123456789			18
 * 16���ƣ�0123456789abcdef		0x12
 * 
 * ��η������鵱�е�һ������Ԫ���أ���ʽ��
 * ��������[����]
 * ������Ҳ�������鵱�ж��Ԫ�صı�ţ�����0��ʼ����һֱ��������-1��Ϊֹ��
 * 
 * ��̬��ʼ����ʱ�����鵱�е�Ԫ�ض��ᱻ����һ��Ĭ��ֵ������
 * �����������Ĭ�Ͼ���0������Ǹ�������Ĭ�Ͼ���0.0��������ַ���Ĭ�Ͼ���'\u0000'��Unicodeд������
 * ����ǲ���ֵ��Ĭ�Ͼ���false��������ַ����������������ͣ���ôĬ��null���֣��ճ�������
 */
public class Demo02ArrayVisit {
	
	public static void main(String[] args) {
		int[] arrayA = new int[3];
		
		System.out.println(arrayA); // �������ƣ�[I@6d1e7682
		System.out.println(arrayA[0]); // ��0��Ԫ�أ�0
		System.out.println(arrayA[1]); // ��1��Ԫ�أ�0
		System.out.println(arrayA[2]); // ��2��Ԫ�أ�0
		
		System.out.println("===================");
		
		double[] arrayB = new double[3];
		System.out.println(arrayB); // �������ƣ���ӡ�õ���ֵַ��[D@424c0bc4
		System.out.println(arrayB[0]); // 0.0
		System.out.println(arrayB[1]); // 0.0
		System.out.println(arrayB[2]); // 0.0
		
		System.out.println("===================");
		
		// �ı����鵱�еľ���Ԫ��
		arrayB[1] = 3.14;
		System.out.println(arrayB[0]); // 0.0
		System.out.println(arrayB[1]); // 3.14
		System.out.println(arrayB[2]); // 0.0
		
		// ��һ�����������Ԫ�ص����ݣ���ֵ��һ������
		double num = arrayB[1];
		System.out.println("num�����������ǣ�" + num);
	}

}
