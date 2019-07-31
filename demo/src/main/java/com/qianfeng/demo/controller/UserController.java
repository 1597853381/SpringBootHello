package com.qianfeng.demo.controller;

import com.qianfeng.demo.entity.Resource;
import com.qianfeng.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;


/**
 * @author xiaoxinmin
 * @Date 2019/7/29
 */
@PropertySource("classpath:application.properties.bak")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private Resource resource;

//    @Value("${images.serverpath}")
    private String serverpath;

    @RequestMapping("hello")
    public String hello(){
        return "hello SpringBoot";
    }

//    @GetMapping("page")
//    public String page(Integer pageIndex){
//        return "pageIndex:"+pageIndex;
//    }

    @GetMapping("page")
    public String page(@RequestParam(name = "index",required = false,defaultValue = "10") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @GetMapping("page/{index}")
    public String page1(@PathVariable("index") Integer index){
        return "pageIndex:"+index;
    }

    @PostMapping("add")
    public User addUser(User user){
        //user.setDate(new Date());
        return user;
    }

    @RequestMapping("aaa")
    public String aaa(){
        return serverpath;
    }

    @RequestMapping("rec")
    public String rec(){
        return resource.getEmailServer()+":"+resource.getImageServer();
    }

}






















