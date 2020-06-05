package com.sj.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
1 整合mybatis-plus
 1）导入依赖
 2）配置
    1.配置数据源
        1）导入数据库驱动
        2）配置数据源信息在application.yml中
    2.配置mybatis-plus
        1)使用MyBatisScan扫描dao层所有接口
        2）告诉Mybatis-plus sql的映射文件

 */
@MapperScan("com.sj.mall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
