package com.itheima.sh.service;

import com.itheima.sh.dao.ProductDao;
import com.itheima.sh.domain.Product;
import com.mongodb.DBCursor;

public class ProductService {
	// ����dao��Ķ���
	ProductDao dao = new ProductDao();

	// ��ѯ������Ʒ��Ϣ
	public DBCursor findAllProducts() throws Exception {
		return dao.findAllProducts();
	}

	// ������Ʒ��Ų�ѯ��Ʒ��Ϣ
	public DBCursor findProductsByPid(int pid) throws Exception {
		// TODO Auto-generated method stub
		return dao.findProductsByPid(pid);
	}

	// �����Ʒ
	public void addProduct(Product p) throws Exception {
		dao.addProduct(p);
	}
	//���ݱ��ɾ����Ʒ
	public void deleteProductByPid(int pid) throws Exception {
		dao.deleteProductByPid(pid);
		
	}

}
