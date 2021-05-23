package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * java类简单作用描述
 *
 * @projectName: cloud2020
 * @package: com.atguigu.springcloud.dao
 * @className: PaymentDao
 * @description: java类作用描述
 * @author: 张广东
 * @createDate: 2021/5/23 10:37
 * @updateUser: 张广东
 * @updateDate: 2021/5/23 10:37
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2021</p>
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
