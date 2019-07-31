package com.qianfeng.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xiaoxinmin
 * @Date 2019/7/30
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String responseCod;
    private T data;
}
