package com.itheima.sh.dao;

import com.itheima.sh.domain.Product;
import com.itheima.sh.utils.MongoDBUtils;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class ProductDao {
	//��ѯ������Ʒ��Ϣ
	public DBCursor findAllProducts() throws Exception {
		// ���ݹ������еķ�����ȡ���ݿ�����
		DB db = MongoDBUtils.getDB("itcast");
		//�������ݿ����ӻ�ȡ��Ӧ�ļ���
		DBCollection coll = db.getCollection("products");
		//ʹ��coll������÷�����ȡ����
		DBCursor cur = coll.find();
		return cur;
	}
	//������Ʒ��Ų�ѯ��Ʒ��Ϣ
	public DBCursor findProductsByPid(int pid) throws Exception {
		// ��ȡ���ݿ�����
		DB db = MongoDBUtils.getDB("itcast");
		//��ȡ���ݿ��еı�(����)����
		DBCollection coll = db.getCollection("products");
		//�������� DBObject����BasicDBObject�ุ�ӿ�
		//BasicDBObject�ײ���HashMap {"pid":pid}
		DBObject basicDBObject = new BasicDBObject();
		//��pid��ӵ�BasicDBObject��
		basicDBObject.put("pid", pid);
		//��basicDBObject��Ϊ���������ݿ��в�ѯ��Ʒ
		DBCursor cur = coll.find(basicDBObject);
		return cur;
	}
	// �����Ʒ
	public void addProduct(Product p) throws Exception {
		// ��ȡ��������
		DBCollection coll = MongoDBUtils.getCollection("itcast", "products");
		// ��������
		DBObject db=new BasicDBObject();
		//�������
		db.put("pid", p.getPid());
		db.put("pname", p.getPname());
		db.put("price", p.getPrice());
		//ʹ�ü������ӽ����ݲ��뵽���ݿ���
		coll.insert(db);
		
	}
	//���ݱ��ɾ����Ʒ
	public void deleteProductByPid(int pid) throws Exception {
		// ��ȡ��������
		DBCollection coll = MongoDBUtils.getCollection("itcast", "products");
		//��������
		DBObject dbs=new BasicDBObject();
		//�������
		dbs.put("pid", pid);
		//ʹ�ü������Ӷ���coll���÷�������ɾ��
		coll.remove(dbs);
	}

}
