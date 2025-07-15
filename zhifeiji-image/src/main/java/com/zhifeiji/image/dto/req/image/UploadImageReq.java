package com.zhifeiji.image.dto.req.image;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadImageReq {

    // 图片名称
    private String name;
    // 分区id
    private String partId;
    // 图片cos
    private String cosKey;
    // 用户昵称
    private String userNickName;
    // 图片url
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
