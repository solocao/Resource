package com.itheima.sh.web;

import java.util.Scanner;

import com.itheima.sh.domain.Product;
import com.itheima.sh.service.ProductService;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/*
 * --------��ӭ������Ʒ����ϵͳ--------

��������������в�����

C:�����Ʒ D:���ݱ��ɾ����Ʒ DA:ɾ��������Ʒ I:������Ʒ��Ų�ѯ��Ʒ��Ϣ FA:��ѯ������Ʒ��Ϣ Q:�˳�

 */
public class ProductWeb {

	public static void main(String[] args) {
		// ��������¼��Ķ���
		Scanner sc = new Scanner(System.in);
		// α���ó����ܹ��ص��������ʹ��ѭ��
		while (true) {
			// ��ʾ
			System.out.println("--------��ӭ������Ʒ����ϵͳ--------");
			System.out.println("��������������в�����");
			System.out.println("C:�����Ʒ D:���ݱ��ɾ����Ʒ DA:ɾ��������Ʒ I:������Ʒ��Ų�ѯ��Ʒ��Ϣ FA:��ѯ������Ʒ��Ϣ Q:�˳�");
			// ��ȡ�������Ϣ
			String inputChoice = sc.nextLine();
			// ʹ�ö��֧����ѡ��
			switch (inputChoice.toUpperCase()) {
			case "C":
				// System.out.println("�����Ʒ");
				// ���÷��������ݿ��������Ʒ
				addProduct();
				break;
			case "D":
				// System.out.println("���ݱ��ɾ����Ʒ");
				// ���ݱ��ɾ����Ʒ
				deleteProductByPid();
				break;
			case "DA":
				System.out.println("ɾ��������Ʒ ");
				break;
			case "I":
				// System.out.println("������Ʒ��Ų�ѯ��Ʒ��Ϣ");
				findProductsByPid();
				break;
			case "FA":
				// System.out.println("��ѯ������Ʒ��Ϣ");
				// ���÷��� ��ѯ������Ʒ��Ϣ
				findAllProducts();
				break;
			case "Q":
				// System.out.println("�˳�");
				// break;
			default:
				// System.out.println("�˳�");
				System.out.println("лл����");
				// ��ֹ�����
				System.exit(0);
				break;
			}
		}

	}

	// ���ݱ��ɾ����Ʒ
	public static void deleteProductByPid() {
		// ��������¼��Ķ���
		Scanner sc = new Scanner(System.in);
		try {
			//��ʾ
			System.out.println("������Ҫɾ������Ʒ��ţ�");
			//��ȡ
			int pid = Integer.parseInt(sc.nextLine());
			//�ȵ����ݿ��в�ѯ��Ʒ�Ƿ����
			ProductService productService = new ProductService();
			//��ѯ
			DBCursor cur = productService.findProductsByPid(pid);
			//�ж�
			if(cur.size() == 0)
			{
				System.out.println("�Բ���û����Ҫɾ����Ʒ");
				return;
			}
			//�������ִ�е����˵�����ݿ����Ǵ��ڸ���Ʒ��
			//��ʾ
			System.out.println("��Ʒ���\t��Ʒ����\t��Ʒ�۸�");
			while(cur.hasNext())
			{
				//ȡ����Ʒ
				DBObject product = cur.next();
				//���
				System.out.println(product.get("pid")+"\t"+product.get("pname")+"\t"+product.get("price"));
			}
			//��ʾ�Ƿ�ȷ��ɾ��
			System.out.println("��ô�õ���Ʒ����ȷ��Ҫɾ����?��y");
			//��ȡ
			String yes = sc.nextLine();
			//�ж�
			if("y".equals(yes))
			{
				//˵��ȷ��ɾ��
				productService.deleteProductByPid(pid);
				System.out.println("ɾ����Ʒ�ɹ�");
			}else
			{
				//˵��ȡ��ɾ��
				System.out.println("ȡ��ɾ��");
			}
		} catch (Exception e) {
			System.out.println("������Ʒ��Ų�ѯ��Ʒʧ��"+e);
		}

	}

	// �����Ʒ
	public static void addProduct() {
		// ��������¼��Ķ���
		Scanner sc = new Scanner(System.in);
		try {
			// ��ʾ
			System.out.println("��������Ʒ��ţ�");
			// ��ȡ
			String pidStr = sc.nextLine();
			int pid = Integer.parseInt(pidStr);
			// ��ʾ
			System.out.println("��������Ʒ���ƣ�");
			// ��ȡ
			String pname = sc.nextLine();
			// ��ʾ
			System.out.println("��������Ʒ�۸�");
			// ��ȡ
			String priceStr = sc.nextLine();
			int price = Integer.parseInt(priceStr);
			// ����Product��Ķ���
			Product p = new Product();
			// ��װ����
			p.setPid(pid);
			p.setPname(pname);
			p.setPrice(price);
			// ����ҵ������
			ProductService productService = new ProductService();
			// ���÷�����ҵ��㴫������
			productService.addProduct(p);
			System.out.println("��Ʒ��ӳɹ�");
		} catch (Exception e) {
			System.out.println("�����Ʒʧ��" + e);
		}
	}

	// ������Ʒ��Ų�ѯ��Ʒ��Ϣ
	public static void findProductsByPid() {
		// ��������¼��Ķ���
		Scanner sc = new Scanner(System.in);
		try {
			// ��ʾ
			System.out.println("������Ҫ��ѯ����Ʒ��ţ�");
			// ��ȡ
			String pidStr = sc.nextLine();
			// ǿת
			int pid = Integer.parseInt(pidStr);
			// ����ҵ������
			ProductService productService = new ProductService();
			// ���÷�������¼����Ʒpid�����ݿ��в�ѯ��Ʒ��Ϣ
			DBCursor cur = productService.findProductsByPid(pid);
			// �ж��Ƿ����¼���pid��Ӧ����Ʒ
			if (cur.size() != 0) {
				// ˵���и���Ʒ
				System.out.println("��Ʒ���\t��Ʒ����\t��Ʒ�۸�");
				// �����ұ�
				while (cur.hasNext()) {
					// ˵��������
					// ȡ����Ʒ
					DBObject product = cur.next();
					// ���
					System.out.println(product.get("pid") + "\t" + product.get("pname") + "\t" + product.get("price"));
				}
			} else {
				System.out.println("�Բ���û����Ҫ��ѯ����Ʒ��Ϣ");
			}
		} catch (Exception e) {
			System.out.println("������Ʒ��Ų�ѯ��Ʒʧ��" + e);
		}

	}

	// ��ѯ������Ʒ��Ϣ
	public static void findAllProducts() {
		// ����ҵ������
		ProductService productService = new ProductService();
		try {
			// ���÷�����ȡ������Ʒ��Ϣ
			DBCursor cur = productService.findAllProducts();
			// ����cur�ж����ݿ����Ƿ�������
			if (cur.size() == 0) {
				// ˵��û������
				System.out.println("�Բ������ݿ���û����Ҫ��ѯ������");
			} else {
				// ˵�������� ��ȡcur�α��е�����
				System.out.println("��Ʒ���\t��Ʒ����\t��Ʒ�۸�");
				while (cur.hasNext()) {
					// ��ȡ��Ʒ ��ȡÿһ�� {"name":"BMW"}
					DBObject product = cur.next();
					// ���
					System.out.println(product.get("pid") + "\t" + product.get("pname") + "\t" + product.get("price"));
				}
			}
		} catch (Exception e) {
			System.out.println("��ѯ������Ʒʧ��" + e);
		}
	}
}
