package com.zxcc.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zxcc.test.mapper")
public class SpringcloudTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTestApplication.class, args);
    }

}