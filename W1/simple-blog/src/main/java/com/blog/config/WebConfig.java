package com.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
public class WebConfig {

    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setPrefix("");
        resolver.setSuffix(".ftl"); //ini digunakan karena sebelumnya .ftl tidak bisa terbaca. Solusi awalnya adalah menjadikan formatnya menjadi .ftlh
        resolver.setContentType("text/html; charset=UTF-8");
        return resolver;
    }
}