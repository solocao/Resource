package cn.itcast.day07.demo02;

import java.util.Scanner;

/*
 * �ڸղŵĵ�¼���뵱�У������������εĹ��ܡ�
 * 
 * ������
 * 1. �ظ����߼���Ӧ��ʹ��ѭ����
 * 2. �����ظ�����ȷ����Ӧ��ʹ��forѭ����
 * 3. ��Ҫ�ڴ����ʱ����ʾʣ����ٴε���ʾ��
 * 4. ����ɹ��ˣ���ô��ʾ��ӭ��Ϣ�������˳�ϵͳ��
 * 5. ���ʧ���ˣ���ô��ʾʣ����ٴΣ��������ԡ�
 */
public class Demo03LoginRetry {

	public static void main(String[] args) {
		// ������Ҫע���ʱ��ָ��һ����ȷ���û���������ȷ������
		String registUsername = "admin"; // ע��ʱ����ȷ���û���
		String registPassword = "123456abc"; // ע��ʱ����ȷ������
		
		// ��Ҫ�������������ַ���
		Scanner sc = new Scanner(System.in); // ����
		
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("�������û�����");
			String inputUsername = sc.next(); // ��ȡ����������û����ַ���
			System.out.println("���������룺");
			String inputPassword = sc.next(); // ��ȡ����˨��������ַ���
			
			if (inputUsername.equalsIgnoreCase(registUsername) && inputPassword.equals(registPassword)) {
				System.out.println("��¼�ɹ�����ӭʹ�ã�");
				// �����¼�ɹ�����Ӧ����ѭ����Ӧ���˳�ϲ��
				break;
			} else { // �����¼ʧ��
				// ����һ���ǲ������һ��
				// ��������һ�Σ���ô����ʾ���Դ����ľ�
				// ����������һ�Σ���ô��ʾʣ�����
				if (i == 3) { // ��������һ��
					System.out.println("��¼ʧ�ܣ����Դ����ľ������ǵ��ŵİɣ����ݶ���");
				} else { // ����������һ��
					System.out.println("��¼ʧ�ܣ�ʣ�����" + (3 - i) + "�Σ������ԡ�");
				}
			}
		} // for
	}

}
