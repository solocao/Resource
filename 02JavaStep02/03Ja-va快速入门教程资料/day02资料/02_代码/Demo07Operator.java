/*
��ֵ�����

1. ������ֵ�������=	������ѧ������ȵ���˼�����Ǵ���һ�����������Ҳ�����ݽ�����ߵı������д洢��
2. ���ϸ�ֵ�������
	+=		a += 3		a = a + 3
	-=		b -= 4		b = b - 4
	*=		c *= 5		c = c * 5
	/=		d /= 6		d = d / 6
	%=		e %= 7		e = e % 7

ע�����
	��ֵ�����ֻ�������һ����������಻���ǳ������Ҳ඼�С�
*/
public class Demo07Operator {
	public static void main(String[] args) {
		int num1 = 10;
		num1++;
		num1++;
		num1++;
		System.out.println(num1); // 13
		
		int num2 = 20;
		num2 += 5; // num2 = num2 + 5;
		System.out.println(num2); // 25
		
		int a = 10;
		a %= 3; // a = a % 3
		System.out.println(a); // 1
		
		int var1 = 100; // ��ȷд��
		// 200 = 100; // ����д������಻���ǳ���
		// 200 = 200; // ��Ȼ����
		int var2 = var1; // ֻҪ����Ǳ������Ҳ��ǳ��������Ǳ�������
		System.out.println(var2); // 100
	}
}