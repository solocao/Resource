package com.itheima.order.service;

import com.itheima.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;

@RestController
//@Service
@RequestMapping("demo")
public class OrderServiceImpl implements OrderService{
	/**
	 *1.注入订单表的mapper
	 *2.更新订单表
	*3.开启本地事务
	 * 发布对外接口(原本应该写controller层,这里为了简化,直接加上controller注解)
	*4.整合lcn框架,实现分布式事务
	 * 加入tc模块:
	 * 加入lcn的jar包
	*4.1 与tm通信,需要通讯模块
	 * 4.2接管数据源
	 * 4.3添加lcn注解,开启分布式事务
	 */
	@Resource
	private OrderMapper orderMapper;

	//开启lcn的全局事务管理
	@Transactional
	@Override
	@RequestMapping("/updateOrder")
	public int updateOrder() {

		//status 0:代表未支付, 1:代表已支付
		int i = orderMapper.update(1111, 1);
		System.out.println("更新已完成,受影响的数据为"+i+"条");
		return 0;
	}
}
