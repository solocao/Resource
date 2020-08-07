package cn.itcast.order.service.impl;

import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * OrderServiceImpl
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2018-05-20<p>
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 根据城市查询该分片项需要处理的订单数据
     * @param shardingParameter 城市
     * @return 需要处理的订单数据集合
     */
    public List<Order> findOrderByCity(String shardingParameter){
        return orderMapper.findOrderByCity(shardingParameter);
    }

    /**
     * 采用【订单号 % 分片总数 = 当前分片项索引号】来查询该分片需要处理的订单
     * @param shardingTotalCount 分片总数
     * @param shardingItem 当前分项索引号
     * @return 需要处理的订单数据集合
     */
    public List<Order> findOrderBySharding(int shardingTotalCount, int shardingItem){
        return orderMapper.findOrderBySharding(shardingTotalCount, shardingItem);
    }

    /**
     *  修改订单的状态码(已配送)
     * @param status 状态码
     * @param orderId 订单号
     */
    public void updateOrderStatus(String status, Long orderId){
        orderMapper.updateOrderStatus(status, orderId);
    }
}
