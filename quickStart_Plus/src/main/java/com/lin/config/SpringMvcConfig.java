package com.lin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * springmvc 配置文件，加载 controller 包下的 bean 到 spring 容器
 * 尝试不将其注释为 Configuration
 */

@Configuration
@ComponentScan("com.lin.controller")
public class SpringMvcConfig {

}
