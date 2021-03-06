package com.canvas.co.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")//cors를 적용할 URL패턴 정의
//	                .allowedOrigins("http://localhost:3000", "http://dabinweb.shop.s3-website.ap-northeast-2.amazonaws.com/")//자원 공유 허락할 Origin 허락
	                .allowedOrigins("*")//자원 공유 허락할 Origin 허락
	                .allowedMethods("*")//허락할 HTTP method 지정
	                .allowCredentials(true)
	                .allowedHeaders("*");
	  }
	 
}