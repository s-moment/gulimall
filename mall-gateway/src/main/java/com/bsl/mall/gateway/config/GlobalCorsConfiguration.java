package com.bsl.mall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * ClassName: CorsConfiguartion
 * Package: com.bsl.mall.config
 * Description:
 *
 * @Author moment
 * @Create 2024/6/29 10:41
 * @Version 1.0
 */
//@Configuration
public class GlobalCorsConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter() {

        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.addAllowedHeader("*"); //允许哪些请求头跨域
        corsConfiguration.addAllowedMethod("*"); //允许哪些请求方式跨域
        corsConfiguration.addAllowedOrigin("*"); //允许哪些来源跨域
//        corsConfiguration.addExposedHeader("*"); // 暴露头部信息
        corsConfiguration.setAllowCredentials(true); //允许携带cookie跨域


        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();


        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(source);
    }
}
