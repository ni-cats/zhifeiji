package com.zhifeiji.image.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifeiji.image.entity.User;

/**
 * 用户信息业务层
 */
public interface UserService extends IService<User> {
    User getUserByNickname(String nickname);
}
