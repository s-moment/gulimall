package com.bsl.mall.product.dao;

import com.bsl.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-22 11:27:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
