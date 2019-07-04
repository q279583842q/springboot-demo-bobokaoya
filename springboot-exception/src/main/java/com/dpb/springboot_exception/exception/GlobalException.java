package com.dpb.springboot_exception.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

/**
 * @program: springboot-exception
 * @description: 全局异常处理器
 * @author: 波波烤鸭
 * @create: 2019-05-17 10:07
 */
@Configuration
public class GlobalException implements HandlerExceptionResolver {

    /**
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest
            , HttpServletResponse httpServletResponse
            , Object o, Exception ex) {
        ModelAndView mv = new ModelAndView();
        //判断不同异常类型，做不同视图跳转
        if (ex instanceof ArithmeticException) {
            mv.setViewName("error1");
        }
        if (ex instanceof NullPointerException) {
            mv.setViewName("error2");
        }
        mv.addObject("error", ex.toString());
        return mv;
    }
}
