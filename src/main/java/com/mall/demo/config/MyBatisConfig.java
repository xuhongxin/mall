package com.mall.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 *
 * @author: create by hongxin.xu
 * @date: 2022/8/15
 **/
@Configuration
@MapperScan("com.mall.demo.mbg.mapper")
public class MyBatisConfig {
}
