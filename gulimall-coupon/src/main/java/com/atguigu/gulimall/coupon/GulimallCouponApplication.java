package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
1=如何使用nacos作为配置中心统一管理配置
    1-引入依赖nacos-config
    2-创建一个bootstrap.propertis配置文件
        spring.application.name=gulimall-coupon
        spring.cloud.nacos.config.server-addr=127.0.0.1:8848
    3-需要给配置中心默认添加一个数据集，为应用名.properties ;gulimall-coupon.properties;
    4-数据集中添加需要的配置
    5-动态获取配置
    控制器中@RefreshScope动态获取刷新配置
    @Value注解配置
    @Value("${coupon.user.name}")
    优先使用配置中心的数据
2=细节
    1-命名空间隔离
        1默认public（保留空间），默认所有的配置都在public空间
    2
    3
    4
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
