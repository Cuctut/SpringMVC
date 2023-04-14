package com.lin.test;

import com.lin.config.SpringConfig;
import com.lin.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 尝试加载 UserController 这个 bean
 * 在 SpringConfig 中我排除了对 controller 包下的扫描
 * 在 SpringMvcConfig 中我取消了对其的 @Configuration 注释（请尝试加回来）
 */
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = context.getBean(UserController.class);
        System.out.println(bean);
    }
}
