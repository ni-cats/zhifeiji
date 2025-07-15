package com.zhifeiji.image.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    // 图片名称
    private String name;
    // 分区id
    private String partId;
    // 图片cos
    private String cosKey;
    // 用户昵称
    private String userNickName;
    // 图片url地址
    private String url;
    // 经度
    private String Longitude;
    // 纬度
    private String Latitude;
    // 地址
    private String address;
    // 状态
    private Integer status;
}
