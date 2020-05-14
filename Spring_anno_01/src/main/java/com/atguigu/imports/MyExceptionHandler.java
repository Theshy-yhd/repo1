package com.atguigu.imports;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-18:36
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        MyException me=null;
        if (e instanceof MyException){
            me=(MyException) e;
        }else{
            me=new MyException();
        }
        me.setMsg("出错了！");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",me.getMsg());
        mv.setViewName("error");
        return mv;
    }
}
