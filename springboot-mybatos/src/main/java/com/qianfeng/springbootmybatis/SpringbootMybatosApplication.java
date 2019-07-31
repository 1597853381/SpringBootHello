package com.qianfeng.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qianfeng.springbootmybatis.mapper")
public class SpringbootMybatosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatosApplication.class, args);
    }

}
