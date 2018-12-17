package com.ligh.config;

import com.ligh.interceptor.OneInterceptor;
import com.ligh.interceptor.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport{

    /**
     *  处理前后端跨域问题
     * @param registry
     */
//    @Override
//    protected void addCorsMappings(CorsRegistry registry) {
//        System.out.println("hahaha");
//        registry.addMapping("/**")
//                .allowCredentials(true)
//                .allowedHeaders("*")
//                .allowedMethods("*")
//                .allowedOrigins("*");
//    }

    /**
     *  拦截器安装顺序执行
     *
     * @param registry
     */

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {

        /**
         *  注册拦截器
         */
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**");

        super.addInterceptors(registry);
    }
}
