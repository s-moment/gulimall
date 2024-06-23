package com.bsl.mall.order.dao;

import com.bsl.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-23 10:21:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
