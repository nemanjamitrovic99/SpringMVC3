package com.pluralsight.conferenceMVC1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ConferenceConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/jsp/");
        bean.setSuffix(".jsp");
        //ovo dole mu govori da li imamo vise ViewResolvera i kazemo kojim redom pokrecemo viewResolvere
        bean.setOrder(0);
        return bean;
    }
}
