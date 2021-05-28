package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author deng_you_ping
 * @email 971572657@qq.com
 * @date 2021-05-28 22:33:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
