public class Demo11ForVsWhile {
	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			System.out.println(a);
		}
		// ����a�Ƕ�����forѭ���ڲ��ģ�������forѭ���ķ�Χ�������޷�ʹ��
		// System.out.println(a); // ����д����
		
		System.out.println("=================");
		int b = 1; // ������whileѭ�������棬������������
		while (b <= 5) {
			System.out.println(b);
			b++;
		}
		
		System.out.println("=================");
		
		System.out.println(b); // ��ȷд����
	}
}