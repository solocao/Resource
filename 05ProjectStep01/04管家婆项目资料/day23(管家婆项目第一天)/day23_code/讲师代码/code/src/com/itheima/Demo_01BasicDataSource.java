package com.itheima;

import org.apache.commons.dbcp.BasicDataSource;

/*
 * ʹ�����ݿ�����ӳ�
 * DBCP���ӳ�
 *   BasicDataSource ʵ�� javax.sql.DataSource�ӿ�
 */
public class Demo_01BasicDataSource {

	public static BasicDataSource getSource(){
		BasicDataSource source = new BasicDataSource();
		//BasicDataSource���������ñ�Ҫ����
		//������������
		source.setDriverClassName("com.mysql.jdbc.Driver");
		//�������ݿ�����URL
		source.setUrl("jdbc:mysql://localhost:3306/gjp");
		//�����û���������
		source.setUsername("root");
		source.setPassword("123");
		return source;
	}
}
