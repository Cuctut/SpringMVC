package com.lin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 此为 spring 配置
 * 在 spring 和 springmvc 并存的环境下，我们不想让 spring 加载到 springmvc 加载了的 Controller
 * 应该 excludeFilters 设置排除条件
 */

@Configuration
@ComponentScan(
        value = "com.lin",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)
)
public class SpringConfig {

}
