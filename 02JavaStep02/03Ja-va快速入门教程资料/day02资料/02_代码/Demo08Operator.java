/*
�Ƚ������Ҳ������ϵ�����������������������֮��Ĺ�ϵ��

����		>
С��		<
���ڵ���	>=
С�ڵ���	<=
����		==		��ע�⡿�����Ⱥ���д��������ȵ���˼��
������		!=

�Ƚ���������һ����һ��booleanֵ������true��������false
*/
public class Demo08Operator {
	public static void main(String[] args) {
		System.out.println(4 > 3); // true
		System.out.println(4 < 3); // false
		
		System.out.println("===================");
		
		System.out.println(10 >= 6); // true
		System.out.println(10 >= 10); // true
		System.out.println(10 >= 20); // false
		
		System.out.println("===================");
		
		System.out.println(10 <= 20); // true
		System.out.println(20 <= 20); // true
		System.out.println(20 <= 3); // false
		
		System.out.println("===================");
		
		// System.out.println(4 = 5); // ����д�������Ǹ�ֵ����ֵ����������һ��������
		System.out.println(4 == 5); // false
		System.out.println(4 == 4); // true
		
		System.out.println("===================");
		
		System.out.println(4 != 5); // true
		System.out.println(4 != 4); // false
		
		System.out.println("===================");
		
		int a = 10;
		int b = 20;
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println(a <= b); // true
	}
}