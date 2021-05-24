package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

import javax.annotation.Resource;

/**
 * java类简单作用描述
 *
 * @projectName: cloud2020
 * @package: com.atguigu.com.atguigu.springcloud.controller
 * @className: PaymentController
 * @description: java类作用描述
 * @author: 张广东
 * @createDate: 2021/5/23 10:47
 * @updateUser: 张广东
 * @updateDate: 2021/5/23 10:47
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2021</p>
 */
@RestController
@Slf4j
public class PaymentController {
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {

        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

}
