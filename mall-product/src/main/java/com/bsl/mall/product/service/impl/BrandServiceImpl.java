package com.bsl.mall.product.service.impl;

import com.bsl.mall.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bsl.common.utils.PageUtils;
import com.bsl.common.utils.Query;

import com.bsl.mall.product.dao.BrandDao;
import com.bsl.mall.product.entity.BrandEntity;
import com.bsl.mall.product.service.BrandService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //1、获取key
        String key = (String) params.get("key");
        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<>();
        //如果传过来的数据不是空的，就进行多参数查询
        if (!StringUtils.isEmpty(key)) {
            wrapper.eq("brand_id", key).or().like("name", key);
        }

        IPage<BrandEntity> page = this.page(new Query<BrandEntity>().getPage(params), wrapper);

        return new PageUtils(page);
    }

    @Override
    @Transactional
    public void updateDetail(BrandEntity brand) {
        //保证冗余字段的数据一致
        this.updateById(brand);
        if (!StringUtils.isEmpty(brand.getName())) {
            //同步更新其他关联表中的数据
            categoryBrandRelationService.updateBrand(brand.getBrandId(), brand.getName());

            //TODO 更新其他关联
        }
    }

}