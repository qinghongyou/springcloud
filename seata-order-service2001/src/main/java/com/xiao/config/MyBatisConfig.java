package com.xiao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.xiao.dao"})
public class MyBatisConfig {
}
