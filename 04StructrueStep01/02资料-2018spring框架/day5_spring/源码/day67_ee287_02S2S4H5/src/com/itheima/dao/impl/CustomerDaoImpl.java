package com.itheima.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.dao.ICustomerDao;
import com.itheima.domain.Customer;
/**
 * 客户的持久层实现类
 * @author zhy
 *
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements ICustomerDao {



	@Override
	public List<Customer> findAllCustomer() {
		return (List<Customer>) getHibernateTemplate().find("from Customer");
	}

	@Override
	public void saveCustomer(Customer customer) {
		getHibernateTemplate().save(customer);
	}

}
