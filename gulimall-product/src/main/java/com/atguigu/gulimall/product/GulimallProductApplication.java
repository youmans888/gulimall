package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//整合mybatis-Plus
//1导入依赖
/* <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.3.1</version>
       </dependency>

2)配置
    1配置数据源
        1导入数据库的驱动
        2在application.yml配置数据源相关信息
    2配置mybatis-Plus
        1使用@MapperScan
        2告诉Mybatis-Plus,sql映射文件位置
 */
@MapperScan("com/atguigu/gulimall/product/dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
