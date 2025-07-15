package com.zhifeiji.image.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifeiji.image.common.enums.Magic;
import com.zhifeiji.image.dto.req.user.CreateUserReq;
import com.zhifeiji.image.entity.User;
import com.zhifeiji.image.mapper.UserMapper;
import com.zhifeiji.image.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
        return Magic.ONE.getCode() == userMapper.insert(user);
    }

    @Override
    public Boolean delete(Long id) {
        return Magic.ONE.getCode() == userMapper.deleteById(id);
    }
}
