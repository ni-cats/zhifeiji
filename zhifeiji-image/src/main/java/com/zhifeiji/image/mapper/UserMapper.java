package com.zhifeiji.image.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhifeiji.image.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息存储层
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
