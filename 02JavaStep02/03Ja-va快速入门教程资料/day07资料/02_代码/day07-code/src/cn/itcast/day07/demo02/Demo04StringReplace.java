package cn.itcast.day07.demo02;

/*
 * ���ϣ�����ַ�������ָ���Ĳ��ֽ����滻��������Ҫʹ�ã�
 * 
 * public String replace(CharSequence oldStr, CharSequence newStr)�����ַ������г��ֵ�����oldStr���֣��滻��Ϊָ����newStr��
 * ����oldStr������Ҫ���滻�����ַ�������
 * ����newStr������Ҫ�滻��Ϊ�����ַ�������
 * ��������CharSequence�ֽ׶ο��Լ򵥵���Ϊ�����ַ���String��
 * 
 * ע�⣺
 * �ַ��������ݲ��ᷢ���ı�ģ�����replace�����ķ���ֵ�����һ��ȫ�µ��ַ�����
 */
public class Demo04StringReplace {
	
	public static void main(String[] args) {
		String str1 = "How do you do?";
		String str2 = str1.replace("o", "*");
		System.out.println(str1); // How do you do?
		System.out.println(str2); // H*w d* y*u d*?
		System.out.println("===============");
		
		String str3 = "�᲻������������ү�����Ƿ��ˣ�";
		String str4 = str3.replace("���ү", "***");
		System.out.println(str4); // �᲻���������***�����Ƿ��ˣ�
	}

}
