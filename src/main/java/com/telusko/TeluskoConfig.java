package com.telusko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//This file is instead of telusko-servlet.xml
//this is part of servlet 3.0
@Configuration
@ComponentScan({"com.telusko"})
public class TeluskoConfig {
	//this method is so we don't have to mention extention in Controllers
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		
		return vr;
	}
}
