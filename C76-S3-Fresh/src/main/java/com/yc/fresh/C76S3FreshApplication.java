package com.yc.fresh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.yc.fresh.web.LoginInterceptor;



@SpringBootApplication
@MapperScan("com.yc.fresh")
public class C76S3FreshApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(C76S3FreshApplication.class, args);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor())
				// 添加拦截规则
				.addPathPatterns("/tocart")
				.addPathPatterns("/tomember")
				.addPathPatterns("/addcart");
		
	}
	
}
