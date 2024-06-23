package com.bsl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsl.common.utils.PageUtils;
import com.bsl.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-22 11:27:56
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

