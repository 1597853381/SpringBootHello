package com.qianfeng.springbootmybatis.service;

import com.qianfeng.springbootmybatis.entity.TStudent;

/**
 * @author xiaoxinmin
 * @Date 2019/7/29
 */
public interface IStudentService {
    TStudent getById(Integer id);
}
