package com.ligh.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ExceptionHandler {

    public static final String ERROR_VIEW = "error";

   /* @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e)throws Exception{
        e.printStackTrace();

        ModelAndView view = new ModelAndView();
        view.addObject("exception",e);
        view.addObject("url",request.getRequestURL());
        view.setViewName(ERROR_VIEW);
        return view;
    }*/
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e) throws Exception{
        e.printStackTrace();
        if(isAjax(request)){
            return response;
        }else {
            ModelAndView view = new ModelAndView();
            view.addObject("exception",e);
            view.addObject("url",request.getRequestURL());
            view.setViewName(ERROR_VIEW);
            return view;
        }

    }

    public static Boolean isAjax(HttpServletRequest request){
        return (request.getHeader("X-Requested-With") != null && "XMLHttpRequest"
        .equals(request.getHeader("X-Request-With").toString()));
    }
}
