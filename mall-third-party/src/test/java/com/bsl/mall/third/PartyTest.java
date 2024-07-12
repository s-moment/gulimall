package com.bsl.mall.third;

import com.aliyun.oss.OSSClient;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;

/**
 * ClassName: PartyTest
 * Package: com.bsl.mall
 * Description:
 *
 * @Author moment
 * @Create 2024/7/6 10:51
 * @Version 1.0
 */
@SpringBootTest
public class PartyTest {
    @Autowired
    OSSClient ossClient;

    @Test
    void contextLoads() throws Exception{
        ossClient.putObject("tutu-fast","245.jpg",new FileInputStream("D:\\AMUSE\\pics\\6a1b2703a9ed8737.jpg"));
        ossClient.shutdown();
        System.out.println("==========上传成功==========");
    }
}
