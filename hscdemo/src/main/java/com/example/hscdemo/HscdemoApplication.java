package com.example.hscdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.hscdemo.mapper")
public class HscdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HscdemoApplication.class, args);
    }

}
