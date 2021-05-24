package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * java类简单作用描述
 *
 * @projectName: cloud2020
 * @package: com.atguigu.springcloud.config
 * @className: ApplicationContextConfig
 * @description: java类作用描述
 * @author: 张广东
 * @createDate: 2021/5/23 16:12
 * @updateUser: 张广东
 * @updateDate: 2021/5/23 16:12
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2021</p>
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
