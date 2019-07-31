package com.qianfeng.springbootmybatis.controller;

import com.qianfeng.springbootmybatis.entity.TStudent;
import com.qianfeng.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoxinmin
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("student")
public class StudentController {


    @Autowired
    private IStudentService studentService;


    @RequestMapping("getById/{id}")
    public TStudent getById(@PathVariable("id") Integer id){
        System.out.println(id);
        return studentService.getById(id);
    }
}
