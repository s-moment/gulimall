package com.bsl.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsl.common.utils.PageUtils;
import com.bsl.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-23 10:21:18
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

