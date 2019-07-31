package com.qianfeng.springbootmybatis.entity;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * @author xiaoxinmin
 * @Date 2019/7/30
 */
@Data
public class User {
    @NotNull
    private String name;
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机格式错误")
    @NotBlank(message = "手机号不能为空")
    private String phone;
    @Email(message = "邮箱格式不正确")
    private String email;
    @Min(18)
    private Integer age;
}
