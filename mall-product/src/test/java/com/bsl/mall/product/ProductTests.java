package com.bsl.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bsl.mall.product.entity.BrandEntity;
import com.bsl.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * ClassName: ProductTests
 * Package: com.bsl.mall.product
 * Description:
 *
 * @Author moment
 * @Create 2024/6/22 14:05
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
       /* BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("三星");
        brandService.save(brandEntity);
        System.out.println("保存成功！");*/
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 9L));
        list.forEach((item)->{
            System.out.println(item);
        });

    }
}
