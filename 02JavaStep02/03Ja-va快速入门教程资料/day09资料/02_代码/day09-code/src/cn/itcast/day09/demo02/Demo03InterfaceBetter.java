package cn.itcast.day09.demo02;

/*
 * ʹ�ýӿ���Ϊ������͵ĺô����ڣ�
 * ���ε����Ҳ�ĸ������е����ݣ��ﵽ���롢ͳһ��Ŀ�ġ�
 * 
 * ����ӿڱ�̣�
 * ���ʹ�õĹ��ܣ��ӿ��Ѿ��������㣬��ô�Ͳ��ں����������˭��ֻ�ں��ӿڼ��ɡ�
 */
public class Demo03InterfaceBetter {
	
	public static void main(String[] args) {
		Cat cat = new Cat(); // ������һֻè
		method(cat); // ��è���󴫵ݸ����������ʹ�����е�eat��sleep������
		
		Dog dog = new Dog(); // ������һ����
		method(dog);
		
		Animal animalA = cat;
		Animal animalB = dog;
	}
	
	// ʹ�ýӿ���Ϊ�������ͣ������Ͳ����ֵ�����è���ǹ���
	public static void method(Animal animal) {
		animal.eat();
		animal.sleep();
//		animal.watchHouse(); // �����޷����ù�ר�еķ���
//		animal.catchMouse(); // �����޷�����èר�еķ���
	}
	
}
