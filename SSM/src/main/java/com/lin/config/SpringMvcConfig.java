package com.lin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.lin.controller", "com.lin.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
