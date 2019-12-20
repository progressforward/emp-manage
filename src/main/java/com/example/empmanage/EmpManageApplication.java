package com.example.empmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.empmanage.dao")
public class EmpManageApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmpManageApplication.class, args);
    }

}
