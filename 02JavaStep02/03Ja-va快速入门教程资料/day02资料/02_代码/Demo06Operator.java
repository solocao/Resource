/*
���������������һ�Զ���
�����������++		�����ڱ���ԭ�еĻ����ϣ��ۼ�һ��1����һ������
�Լ��������--		�����ڱ���ԭ�еĻ����ϣ��ۼ�һ��1����һ������

ʹ�ø�ʽ��
	1. �������ڱ�����ǰ�棬���磺	++num
	2. Ҳ�������ڱ����ĺ��棬���磺	num++

ʹ�÷�ʽ��
	1. ����ʹ�ã��Լ�������Ϊһ��������䣬���������κβ�����ϡ�
	2. ���ʹ�ã�����������һ���ϡ�

ǰ�ͺ�����ʹ�÷�ʽ������
1. ����ʹ�õ�ʱ��ǰ++�ͺ�++û���κ�����
2. ���ʹ�õ�ʱ��ǰ++�ͺ�++���ڡ��ش����𡿣�
	A. ����ǡ�ǰ++������ô������������+1��Ȼ�����Ž������ʹ�á����ȼӺ��á�
	B. ����ǡ���++������ô����ʹ�ñ�����ǰ�ı������ݣ�Ȼ���ٽ���+1�����������ú�ӡ�
	
ע�����������������Լ��������ֻ�����ڱ������������ڳ�����
*/
public class Demo06Operator {
	public static void main(String[] args) {
		int num1 = 10;
		// ����ʹ��ǰ++
		++num1;
		System.out.println(num1); // 11
		
		// ����ʹ�ú�++
		num1++;
		System.out.println(num1); // 12
		
		System.out.println("======================");
		
		int num2 = 20;
		// ��������һ����ʹ��
		System.out.println(++num2); // 21
		System.out.println(num2); // 21
		
		System.out.println("======================");
		
		int num3 = 30;
		System.out.println(num3++); // 30
		System.out.println(num3); // 31
		
		System.out.println("======================");
		
		// ����͸�ֵһ����ʹ��
		int x = 10;
		int y = 20;
		
		int result1 = x++;
		System.out.println(result1); // 10
		System.out.println(x); // 11
		
		System.out.println("======================");
		
		int result2 = ++y;
		System.out.println(result2); // 21
		System.out.println(y); // 21
		
		System.out.println("======================");
		
		int a = 10;
		int b = 20;
		// 11 + 20
		int result3 = ++a + b--;
		System.out.println(result3); // 31
		System.out.println(a); // 11
		System.out.println(b); // 19
		
		// System.out.println(100++); // ����д������������ʹ��++����--
	}
}