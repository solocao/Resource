package cn.itcast.day05.demo04;

/*
 * 2. ���������������ͣ�����String����˵����ʽ�����Ĳ������᡿Ӱ��ʵ�ʲ�����
 */
public class Demo02MethodParamRef {
	
	public static void main(String[] args) {
		int[] array = { 10, 20, 30 }; // ��̬��ʼ��һ������
		System.out.println(array[0]); // 10
		System.out.println(array[1]); // 20
		System.out.println(array[2]); // 30
		System.out.println("=================");
		
		change(array);
		
		System.out.println("=================");
		System.out.println(array[0]); // 100
		System.out.println(array[1]); // 200
		System.out.println(array[2]); // 300
	}
	
	public static void change(int[] arr) {
		arr[0] *= 10; // ����ʮ��
		arr[1] *= 10; // ����ʮ��
		arr[2] *= 10; // ����ʮ��
		System.out.println(arr[0]); // 100
		System.out.println(arr[1]); // 200
		System.out.println(arr[2]); // 300
	}

}
