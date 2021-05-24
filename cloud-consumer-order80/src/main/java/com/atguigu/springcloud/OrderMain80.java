package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * java类简单作用描述
 *
 * @projectName: cloud2020
 * @package: com.atguigu.com.atguigu.springcloud
 * @className: PaymentMain8001
 * @description: java类作用描述
 * @author: 张广东
 * @createDate: 2021/5/23 10:25
 * @updateUser: 张广东
 * @updateDate: 2021/5/23 10:25
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2021</p>
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
