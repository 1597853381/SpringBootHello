package com.qianfeng.springbootmybatis.handler;

import com.qianfeng.springbootmybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiaoxinmin
 * @Date 2019/7/30
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean<String> handlerException(Exception exception){
        exception.printStackTrace();
        return new ResultBean("404","你的操作有误，请稍后再试");
    }
}
