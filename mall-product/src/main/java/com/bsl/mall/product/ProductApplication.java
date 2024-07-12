package com.bsl.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: Product
 * Package: com.bsl.mall
 * Description:
 *
 * @Author moment
 * @Create 2024/6/21 16:03
 * @Version 1.0
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.bsl.mall.product.feign")
@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
