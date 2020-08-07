package com.itheima;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/gjp";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "123";
	
	private static final int MAX_IDLE = 3;
	private static final int MAX_WAIT = 3000;
	private static final int MAX_ACTIVE = 5;
	private static final int INITIAL_SIZE = 10;
	
	private static BasicDataSource dataSource = new BasicDataSource();
	
	static{
		dataSource.setDriverClassName(DRIVER_CLASS_NAME);//��������
		dataSource.setUrl(URL);//�������ݿ��ַ
		dataSource.setUsername(USERNAME);//�û���
		dataSource.setPassword(PASSWORD);//����
		
		dataSource.setMaxIdle(MAX_IDLE);//���ӳ����������Ӹ���
		dataSource.setMaxWait(MAX_WAIT);//���ӳ����ȴ�ʱ��
		dataSource.setMaxActive(MAX_ACTIVE);//���ӳ�������Ӹ���
		dataSource.setInitialSize(INITIAL_SIZE);//���ӳس�ʼ�����Ӹ���
	}

	public static DataSource getDataSource(){
		return dataSource;
	}
}
