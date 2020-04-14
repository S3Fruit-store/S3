package com.yc.fresh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.fresh")
public class C76S3FreshApplication {

	public static void main(String[] args) {
		SpringApplication.run(C76S3FreshApplication.class, args);
	}

}
