package com.zhifeiji.image.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    // 姓名
    private String name;
    // 昵称
    private String nickname;
    // 年龄
    private Integer age;
    // 手机号
    private String phone;
    // 性别 0:女 1:男
    private Integer sex;
    // 身份证号
    private String idNumber;
    // 头像URL
    private String avatar;
    // 状态
    private Integer status;
}
