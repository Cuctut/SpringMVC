package com.lin.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Tomcat 服务器的配置文件
 * 加载 spring 配置
 *
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
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringConfig.class);
        return context;
    }

    /**
     * 解决 post 请求中文乱码问题
     * @return filter
     */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
