package com.leo.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leo.mybatis.dao.mapper")
public class SpringbootMybatisDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
  }
}
