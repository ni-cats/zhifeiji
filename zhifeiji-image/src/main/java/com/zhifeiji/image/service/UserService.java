package com.zhifeiji.image.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifeiji.image.dto.req.user.CreateUserReq;
import com.zhifeiji.image.entity.User;

/**
 * 用户信息业务层
 */
public interface UserService extends IService<User> {
    // 根据昵称查询用户
    User getUserByNickname(String nickname);

    // 创建新用户
    Boolean create(CreateUserReq req);

    // 根据ID删除用户
    Boolean delete(Long id);
}
