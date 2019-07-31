package com.qianfeng.springbootmybatis.controller;

import com.qianfeng.springbootmybatis.entity.TStudent;
import com.qianfeng.springbootmybatis.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xiaoxinmin
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("index")
    public String index(){
        int i=1/0;
        return "index";
    }

    @RequestMapping("aaa")
    public String aaa(Model model){
        int money=10000;
        model.addAttribute("money",money);
        return "index";
    }

    @RequestMapping("bbb")
    public String bbb(Model model){
        String mayun="马云";
        model.addAttribute("mayun",mayun);
        return "index";
    }

    @RequestMapping("ccc")
    public String ccc(Model model){
        TStudent student1=new TStudent(1,"张三", "123", 1);
        TStudent student2=new TStudent(1,"张三", "123", 1);
        TStudent student3=new TStudent(1,"张三", "123", 1);
        TStudent student4=new TStudent(1,"张三", "123", 1);
        List<TStudent> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        model.addAttribute("studentList",studentList);
        return "index";
    }

    @RequestMapping("ddd")
    public String ddd(Model model){
        Date date=new Date();
        model.addAttribute("date",date);
        return "index";
    }

    @RequestMapping("eee")
    public String eee(@Valid User user,Model model){
        model.addAttribute("user",user);
        System.out.println(user);
        return "index";
    }

    @RequestMapping("fff")
    public String fff(){
        String s1 = new String("zs");
        String s2 = new String("zs");
        System.out.println(s1 == s2);
        String s3 = "zs";
        String s4 = "zs";
        System.out.println(s3 == s4);
        System.out.println(s3 == s1);
        String s5 = "zszs";
        String s6 = s3+s4;
        System.out.println(s5 == s6);
        final String s7 = "zs";
        final String s8 = "zs";
        String s9 = s7+s8;
        System.out.println(s5 == s9);
        final String s10 = s3+s4;
        System.out.println(s5 == s10);
        return "index";
    }
}
