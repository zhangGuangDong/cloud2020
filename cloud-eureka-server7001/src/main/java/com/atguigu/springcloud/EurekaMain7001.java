package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * java类简单作用描述
 *
 * @projectName: cloud2020
 * @package: com.atguigu.springcloud
 * @className: EurekaMain7001
 * @description: java类作用描述
 * @author: 张广东
 * @createDate: 2021/5/23 17:07
 * @updateUser: 张广东
 * @updateDate: 2021/5/23 17:07
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2021</p>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
