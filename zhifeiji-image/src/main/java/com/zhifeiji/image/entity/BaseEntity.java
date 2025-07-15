package com.zhifeiji.image.entity;

import lombok.Data;

import java.sql.Time;

@Data
public class BaseEntity {
    // 状态 0:禁用，1:正常
    private Integer status;
    // 创建时间
    private Time createTime;
    // 修改时间
    private Time updateTime;
}
