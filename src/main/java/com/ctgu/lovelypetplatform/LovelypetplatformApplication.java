package com.ctgu.lovelypetplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ctgu.lovelypetplatform.mapper")
//com/ctgu/lovelypetplatform
public class LovelypetplatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(LovelypetplatformApplication.class, args);
    }
}
