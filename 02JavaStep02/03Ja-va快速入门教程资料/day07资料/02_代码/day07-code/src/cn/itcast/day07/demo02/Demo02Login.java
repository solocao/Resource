package cn.itcast.day07.demo02;

import java.util.Scanner;

/*
 * ʹ��String���е�equals��equalsIgnoreCase������������ģ��һ���򵥵ĵ�¼������
 * 
 * ������
 * 1. ��¼��Ҫ�û���������������Ϣ��Ҳ���������ַ�����
 * 2. �û���������Ӧ��ʹ�ü������룬��ȡ�����ַ�������ʹ��Scanner��Ҫ�������衣��
 * 3. ���������ǵ�¼�ɹ��أ��϶���Ҫע��ʱ����ǰд����ȷ���û�������ȷ�����롣
 * 4. �ж�������û��������룬����ȷ���û��������������ȫһ����
 * 		A. �û���������ȷ
 * 		B. ���������ȷ
 * 		�������������ǡ����ҡ��Ĺ�ϵ��ȱһ���ɣ��߼��������&&
 * 5. �ж�һ���Ƿ��¼�ɹ���if
 * 6. �����¼�ɹ�����ʾ��ӭ��Ϣ�������¼ʧ�ܣ��˳�ϵͳ��
 */
public class Demo02Login {
	
	public static void main(String[] args) {
		// ������Ҫע���ʱ��ָ��һ����ȷ���û���������ȷ������
		String registUsername = "admin"; // ע��ʱ����ȷ���û���
		String registPassword = "123456abc"; // ע��ʱ����ȷ������
		
		// ��Ҫ�������������ַ���
		Scanner sc = new Scanner(System.in); // ����
		System.out.println("�������û�����");
		String inputUsername = sc.next(); // ��ȡ����������û����ַ���
		System.out.println("���������룺");
		String inputPassword = sc.next(); // ��ȡ����˨��������ַ���
		
		// �ж�һ�£�����������
		// A. ������û�����ע��ʱ�����ȷ�û�������һ��
		// ���û���һ�㲻���ִ�Сд�������ж�Ӧ��ʹ��equalsIgnoreCase��
		// B. ����������ע��ʱ�����ȷ����ҲҪһ��
		// ������һ�����ϸ����ִ�Сд�����������ж�Ӧ��ʹ��equals��
		// A��B����������Ҫͬʱ������У�&&
		// ��ȻҪ�жϣ��϶�ʹ��ѡ��ṹ��if
		if (inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword)) {
			System.out.println("��ӭʹ�ã�");
		} else {
			System.out.println("��¼ʧ�ܣ��˳���");
		}
	}

}
