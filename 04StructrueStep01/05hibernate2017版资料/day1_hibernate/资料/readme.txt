SSH�׶Σ�16���
hibernate��4��
struts2��4��
spring��5��
crm��3��
SSH�׶�ѧϰ���ص㣺��3������ܹ�����Ӧ�á�����������
----------------------------------------------
hibernate4�찲�ţ�
��һ�죺hibernate��������
	�ܹ������hibernate��������
	�ܹ�ʹ��hibernateʵ��CRUD����
�ڶ��죺hibernate��ϸ��˵��
	�����ʶ��
	�������ɷ�ʽ�����ɲ��ԣ�
	һ������Ϳ��ջ���
	�̰߳󶨲������ݿ��Session����
	hibernate�еĲ�ѯ
	Query����
	Criteria����
�����죺hibernate�Ķ��ӳ��Ͳ���
	һ�Զ�
	��Զ�
�����죺JPA������ʹ��hibernate��JPA��ʵ��
	JPA:java persistence api (�淶)
		  �־û�
	ʹ��ע��
---------------------------------------------------
1������ܹ�
	���ֲ� web�㣨MVC��һ�����ֲ�����ģ�ͣ�
	ҵ��� service��
	�־ò� dao��
2�������ܺ�����ܹ��Ĺ�ϵ
	hibernate��ܣ�����һ���־ò���
	struts2��ܣ�����һ�����ֲ���
	spring��ܣ�����һ���ۺ�����

	��ȷ��hibernateֻ�ܲ������ݿ⣨�����ݿ�򽻵���
3�������Ѿ����յĳ־ò㼼��
	JDBC�����ǲ������ݿ���ײ�ķ�ʽ��
	   ���ƣ��ײ㣬Ч�ʸߡ�
	   �׶ˣ���д����ʱ���ȽϷ����������Ƿ�װ�������

	DBUtils�����ǻ���JDBC,��JDBC�����˼򵥵ķ�װ��
	    ���ƣ���װ������Ĳ�����ü򵥡�������Ȼ���Լ���дsql��䣬���Ч�ʲ�û��̫��Ӱ�졣
		  �����˳ص�˼��������ӡ�
	    �׶ˣ�Ҫ��ʵ�������������ƺ����ݿ����ֶ�������һ�¡�
		  Ҫ���ǼǵĶ���Ҳ�Ƚ϶ࡣ

	���ǵĹ�ͬ�㣺��Ҫ�����Լ�дSQL��䡣
4��ʹ��JDBC��DBUtils������Ʒ��ʱ���������⣺
	JDBC�����⣺
		��ѯ��װ�����ʱ��д���ˡ�
	DBUtils�����⣺
		������߸���ʱ����������ֵд���ˡ�
5��������ô�죿
	����дһ�д��롣
	���棺
	   session.save(product);//ִ��java����===>�����ݿ�ı������������һ�����ݣ�insert into��䣩
	��ѯ��
	   Product product = session.get(id);
6����ôʵ�֣�
	������ʵ���ࣺ
		public class Product{
			private Integer pid;
			private String pname;
			private Double price;
		}
	�����б�
		create table product(
			product_id int primary key auto_increment,
			product_name varchar(50),
			product_price double(7,2)
		);
	��JDBC����DBUtils����ʱ�����ʵ����Ĺ�ϵ����SQL��䡣
	insert into product(product_name,product_price)values(product.getPname(),product.getPrice());
	����ʵ����ͱ�֮��Ĺ�ϵ
		ʹ�������ļ���
		�����ļ������ࣺ
			properties
			xml
		ѡ��properties����xml�أ�
			ʹ��XML��
			��ΪXML���������㼶��ϵ
	��Ӧ��ϵ�������ļ�ʾ����
		<class name="����" table="����">
			<id name="ʵ������������" column="���е������ֶ���">
			<property name="������" column="���е��ֶ���"/>
		</class>
		insert into  $tablename$($columnname$,$columnname$) values(product.getxxx,product.getxx)
7��ORM
   Object Relational Mapping
   �����ϵӳ��
   ���ǽ���ʵ��������ݿ��Ķ�Ӧ��ϵ��
   ʵ�ֲ���ʵ���������൱�ڲ������ݿ��
8��hibernate
   ����һ������������ҵ������Դ��ORM�־ò��ܡ��ǿ��Բ������ݿ�Ŀ�ܡ�
   ��ܣ�������һ���ܹ���
   ͨ������£�������̵ĳ־ò���������һ��Ϊ��һ��Ϊ�������߲��棨дSQL���ĺͲ�дSQL���ģ�
   ��������ָ����ʹ��ʱ��������Դ���١���Ŀǰ����ʹ�õĽ׶Σ�ֻ����log4j��c3p0���ӳأ�
   ��ҵ����ָ��������ҵ��Ӧ����ʹ�õıȽ϶�
   ��Դ�ģ�����Դ���롣
   ORM�Ĳ�����ʽ�����������ϵӳ�䣬ʵ�ֲ���ʵ������൱�ڲ������ݿ��
9��CRM��
	CRM���ͻ���ϵ����ϵͳ
10���hibernate�Ŀ����������ص����ݣ�
	Ҫ���ܹ������
	����ʵ�ֱ���һ���ͻ������ݿ�
11��hibernate�����Ű���
12��hibernate�ĳ��ö���
	Configuration
	SessionFactory
	Session
	Transaction
   
��ҵ��
 1��ʵ�ֿͻ���CRUD����
 2���ο��ͻ���CRUD��ʵ����ϵ�˵�CRUD����
 3��Ԥϰhibernate�ڶ��������