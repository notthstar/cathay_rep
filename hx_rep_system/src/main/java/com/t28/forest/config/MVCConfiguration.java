package com.t28.forest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author XiangYuFeng
 * @description Spring MVC配置类
 * @create 2019/10/23
 * @since 1.0.0
 */
@Configuration
public class MVCConfiguration extends WebMvcConfigurerAdapter {

    /**
     * 设置欢迎页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        super.addViewControllers(registry);
    }
}