package com.baeldung.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// @EnableWebMvc
@ComponentScan({ "org.baeldung.web.controller" })
public class ResourceServerWebConfig implements WebMvcConfigurer {
    //
}