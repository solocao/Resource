package cn.itcast.day06.demo07;

public class DemoPerson {
	
	public static void main(String[] args) {
		Person yaSe = new Person(); // Ĭ�Ϲ���
		yaSe.setName("��ɪ");
		yaSe.setAge(20);
		
		Person houYi = new Person("����", 18); // �вι���
		
		// ��������ɪ�ͺ�����к�
		// Ԥ��Ч��Ӧ���ǣ����࣬��á��ҽ���ɪ������20�ꡣ
		yaSe.sayHello(houYi.getName());
		
		// Ȼ���ú������ɪ���к�
		// Ԥ��С��Ӣ���ǣ���ɪ����á��ҽк��࣬����18�ꡣ
		houYi.sayHello(yaSe.getName());
	}

}
