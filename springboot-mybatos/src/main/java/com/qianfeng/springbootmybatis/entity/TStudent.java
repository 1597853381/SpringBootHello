package com.qianfeng.springbootmybatis.entity;

import lombok.Data;

@Data
public class TStudent {

    private Integer id;

    private String username;

    private String password;

    private Integer stunumber;

    public TStudent(Integer id, String username, String password, Integer stunumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.stunumber = stunumber;
    }
}