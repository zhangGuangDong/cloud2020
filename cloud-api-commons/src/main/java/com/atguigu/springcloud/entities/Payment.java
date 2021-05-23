package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * java类简单作用描述
 *
 * @projectName: cloud2020
 * @package: com.atguigu.com.atguigu.springcloud.entities
 * @className: Payment
 * @description: java类作用描述
 * @author: 张广东
 * @createDate: 2021/5/23 10:36
 * @updateUser: 张广东
 * @updateDate: 2021/5/23 10:36
 * @updateRemark: The modified content
 * @version: 1.0
 * <p>copyright: Copyright (c) 2021</p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
