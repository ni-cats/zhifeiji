package com.zhifeiji.image.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifeiji.image.entity.User;
import com.zhifeiji.image.mapper.UserMapper;
import com.zhifeiji.image.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
