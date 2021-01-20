package com.importproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.importproject.dao")
public class ImportprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImportprojectApplication.class, args);
    }

}
