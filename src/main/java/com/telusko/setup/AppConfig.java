package com.telusko.setup;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.telusko","com.telusko.controllers"})
public class AppConfig implements WebMvcConfigurer{
	@Bean
	public static CustomScopeConfigurer customScopeConfigurer() {
		CustomScopeConfigurer configurer = new CustomScopeConfigurer();
		configurer.addScope("session", new SessionScope());
		return configurer;
	}
  @Bean
  public CommonsMultipartResolver multipartResolver() {
      CommonsMultipartResolver resolver = new CommonsMultipartResolver();
      resolver.setMaxUploadSize(10000000);
      return resolver;
  }
//  @Bean
//  public InternalResourceViewResolver viewResolver() {
//    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//    viewResolver.setPrefix("/WEB-INF/views/");
//    viewResolver.setSuffix(".jsp");
//    return viewResolver;
//  }

}
