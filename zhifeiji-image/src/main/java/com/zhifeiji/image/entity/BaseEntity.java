package com.zhifeiji.image.entity;

import lombok.Data;

@Data
public class BaseEntity {
    // 状态 0:禁用，1:正常
    private Integer status;
    // 创建时间
    private Integer createTime;
    // 修改时间
    private Integer modifyTime;
}
