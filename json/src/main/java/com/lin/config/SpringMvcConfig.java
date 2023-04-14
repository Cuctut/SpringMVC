package com.lin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * springmvc 配置文件，加载 controller 包下的 bean 到 spring 容器
 */

@Configuration
@ComponentScan("com.lin.controller")
@EnableWebMvc
public class SpringMvcConfig {

}
