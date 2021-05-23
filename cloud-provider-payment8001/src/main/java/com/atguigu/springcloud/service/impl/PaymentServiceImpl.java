package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * java类简单作用描述
 *
 * @projectName: cloud2020
 * @package: com.atguigu.springcloud.service.impl
 * @className: PaymentServiceImpl
 * @description: java类作用描述
 * @author: 张广东
 * @createDate: 2021/5/23 10:46
 * @updateUser: 张广东
 * @updateDate: 2021/5/23 10:46
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2021</p>
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }

}
