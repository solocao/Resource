/*
�߼���������е��루&������|�����������������˫д��

��·�룺&&
��·��||

1. ��·���������Ѿ������жϵ����յĽ������ô�Ҳཫ����ִ�С���ʡ�¶���Ч����
2. �����õ����롢���������߼������ʱ�򣬶��ǳ��Ƽ�ʹ��˫д����Ϊ˫д�п�����ߴ���ִ�е�Ч�ʡ�
3. ֻ���롢�����˫д����򡢷ǲ���˫д��
*/
public class Demo10Operator {
	public static void main(String[] args) {
		System.out.println(3 < 2 & 10 < 20); // false��һ�����ţ����Ҷ���ִ��
		System.out.println(3 < 2 && 10 < 20); // false��˫д�������������ж����ս�����Ҳ�ı��ʽ����ִ��
		System.out.println("==================");
		
		int num1 = 100;
		System.out.println(3 > 10 && ++num1 < 200); // false
		System.out.println(num1); // 100
		System.out.println("==================");
		
		int num2 = 20;
		System.out.println(3 < 10 || ++num2 > 3); // true
		System.out.println(num2); // 20
		System.out.println("==================");
		
		int num3 = 300;
		System.out.println(3 > 10 || ++num3 < 1000); // true
		System.out.println(num3); // 301
	}
}