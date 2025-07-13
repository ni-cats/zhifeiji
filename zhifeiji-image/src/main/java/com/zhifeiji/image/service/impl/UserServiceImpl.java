package com.zhifeiji.image.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifeiji.image.dto.req.CreateUserReq;
import com.zhifeiji.image.entity.User;
import com.zhifeiji.image.mapper.UserMapper;
import com.zhifeiji.image.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    private final UserMapper userMapper;

    @Override
    public User getUserByNickname(String nickname) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getNickname, nickname);
        return userMapper.selectOne(wrapper);
    }

    @Override
    public Boolean create(CreateUserReq req) {
        User user = User.builder()
                .nickname(req.getNickname())
                .name(req.getName())
                .age(req.getAge())
                .phone(req.getPhone())
                .sex(req.getSex())
                .idNumber(req.getIdNumber())
                .avatar(req.getAvatar())
                .build();
        return userMapper.insert(user) == 1;
    }
}
