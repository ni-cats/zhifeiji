package com.zhifeiji.image.dto.req;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
    private String name;
    private String nickname;
    private String phone;
}
