package cn.itcast.day07.demo01;

/*
 * �ַ�������Ϊ���õĶ��������ڳ�������������ֺܶ���ظ����ַ�����
 * Ϊ�˽�ʡ�ڴ棬���������ˡ��ַ����ء�����ƣ������ظ������ַ�����
 * 
 * �����ַ����صļ���������
 * 1. �ַ�������λ�ڶ��ڴ浱�е�һС����ռ䣬�����������ɸ��ַ����ĵ�ֵַ��
 * 2. �ַ����ص��о��Բ�������ظ����ַ�����Ӧ�ĵ�ַ����֤�ַ������ظ���
 * 3. ����ֱ��˫���ŵ��ַ���Ĭ�϶��ڳ��У���new�������ַ���Ĭ�ϲ��ڳ��С�
 * 
 * ���ڻ���������˵��==�ǽ����������ݵ���ͬ�Ƚϣ����Ƕ�������������˵��==�ǽ��е�ֵַ����ͬ�Ƚϡ�
 * ���������������ô��ֵַ��Ȼ��ͬ�������ֵַ��ͬ����ô��Ȼ��ͬһ������
 */
public class Demo04StringPool {
	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2); // true
		
		char[] array = { 'H', 'e', 'l', 'l', 'o' };
		String str3 = new String(array);
		String str4 = new String(array);
		System.out.println(str3 == str4); // false
		
		System.out.println(str1 == str3); // false
	}

}
