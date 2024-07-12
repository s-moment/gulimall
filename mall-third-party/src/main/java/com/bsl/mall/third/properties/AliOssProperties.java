package com.bsl.mall.third.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.cloud.alicloud.oss")
@Data
public class AliOssProperties {

    private String endpoint;
    @Value("${oss.bucket}")
    private String bucket;

}
