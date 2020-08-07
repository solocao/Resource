package com.itheima.sh.utils;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class MongoDBUtils {
	// 1.ʹ��connection��������Mongo�����ݿ����Ӷ���
	static Mongo connection = null;
	// 2.ʹ��db���վ�������ݿ�����
	static DB db = null;
	// 3.����coll�������ݱ������
	static DBCollection coll = null;

	public static DB getDB(String dbName) throws Exception {
		// ����һ��Mongo�����ݿ����Ӷ���
		connection = new Mongo("127.0.0.1:27017");
		// ͨ����ȡ���ݿ�����Ӷ���connection���ݴ��ݵ����ݿ���dbName�����Ӿ�������ݿ�
		db = connection.getDB(dbName);
		// ����������ݿ����ӷ��ظ�������
		return db;
	}

	public static DBCollection getCollection(String dbName, String collName) throws Exception {
		// ����һ��Mongo�����ݿ����Ӷ���
		connection = new Mongo("127.0.0.1:27017");
		// ͨ����ȡ���ݿ�����Ӷ���connection���ݴ��ݵ����ݿ���dbName�����Ӿ�������ݿ�
		db = connection.getDB(dbName);
		coll = db.getCollection(collName);
		// ����������ݿ����ӷ��ظ�������
		return coll;
	}
}
