package com.bsl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsl.common.utils.PageUtils;
import com.bsl.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-22 11:27:55
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

