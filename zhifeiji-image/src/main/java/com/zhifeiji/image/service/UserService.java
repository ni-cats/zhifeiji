package com.zhifeiji.image.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifeiji.image.dto.req.CreateUserReq;
import com.zhifeiji.image.entity.User;
import org.springframework.stereotype.Service;

/**
 * 用户信息业务层
 */
public interface UserService extends IService<User> {
    // 根据昵称查询用户
    User getUserByNickname(String nickname);

    // 创建新用户
    Boolean create(CreateUserReq req);
}
