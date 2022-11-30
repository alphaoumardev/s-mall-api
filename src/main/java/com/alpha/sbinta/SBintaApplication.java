package com.alpha.sbinta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.alpha.sbinta.mappers")
public class SBintaApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SBintaApplication.class, args);
    }
}
