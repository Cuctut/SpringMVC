package com.lin.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Tomcat 服务器的配置文件
 * 加载 spring 配置
 */
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    /**
     * 加载 springmvc 容器配置
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringMvcConfig.class);
        return context;
    }

    /**
     * 设置哪些请求归属 springmvc 处理
     */
    @Override
    protected String[] getServletMappings() {
        //所有请求
        return new String[]{"/"};
    }

    /**
     * 加载 spring 容器配置
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
