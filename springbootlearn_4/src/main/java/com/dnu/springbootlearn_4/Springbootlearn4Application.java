package com.dnu.springbootlearn_4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.dnu.springbootlearn_4.Mapper"})
public class Springbootlearn4Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootlearn4Application.class, args);
    }

}
