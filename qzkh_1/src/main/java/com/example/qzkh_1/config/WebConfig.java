package com.example.qzkh_1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
//        registry.addViewController("/users/{id}").setViewName("users/show");
//        registry.addViewController("/users").setViewName("users/index");
//        registry.addViewController("/users").setViewName("users/index");
    }
}
