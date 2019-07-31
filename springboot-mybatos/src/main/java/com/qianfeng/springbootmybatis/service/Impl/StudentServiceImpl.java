package com.qianfeng.springbootmybatis.service.Impl;

import com.qianfeng.springbootmybatis.entity.TStudent;
import com.qianfeng.springbootmybatis.mapper.TStudentMapper;
import com.qianfeng.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaoxinmin
 * @Date 2019/7/29
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private TStudentMapper studentMapper;

    @Override
    public TStudent getById(Integer id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
