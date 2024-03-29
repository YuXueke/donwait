package com.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.admin.admin.Dao")
@ServletComponentScan
@SpringBootApplication/*(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})*/
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

    
}
