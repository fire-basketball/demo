package com.ligh.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TwoInterceptor implements HandlerInterceptor{

    final static Logger log = LoggerFactory.getLogger(TwoInterceptor.class);

    /**
     *  在请求处理之前进行调用(controller方法调用之前)
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(true){
            System.out.println("也许被two拦截....");
        }
        System.out.println("被 two拦截了 ...");
        return false;
    }

    /**
     *  请求处理之后进行调用,但是在视图被渲染之前(Controller方法调用之后)
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     *  在整个请求结束之后调用,也就是在DispatcherServlet渲染了对应的视图之后执行,
     * (主要是用于进行资源清理工作)
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
