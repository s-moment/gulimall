package com.bsl.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsl.common.utils.PageUtils;
import com.bsl.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-23 09:56:55
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

