package com.zhifeiji.image.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zhifeiji.image.common.R;
import com.zhifeiji.image.dto.req.user.CreateUserReq;
import com.zhifeiji.image.entity.User;
import com.zhifeiji.image.service.UserService;
import com.zhifeiji.image.utils.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    public UserController() {
        System.out.println(">>> UserController 被加载");
    }

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public R<User> getUser(@RequestParam("nickname") String nickname) {
        if (StringUtils.isBlank(nickname)) {
            return R.error("nickname is empty");
        }
        return R.success(userService.getUserByNickname(nickname));
    }

    @PostMapping("/create")
    public R<String> createUser(@RequestBody CreateUserReq req) {
        // 必须要有昵称(唯一标识)
        if (StringUtils.isBlank(req.getNickname())) {
            return R.error("nickname is empty");
        }
        if (userService.create(req)) {
            return R.success("create user success");
        }
        return R.error("create user failed");
    }

    @GetMapping("/list")
    public R<List<User>> list() {
        return R.success(userService.list());
    }

    @GetMapping("/delete")
    public R<Boolean> delete(@RequestParam("id") Long id) {
        return R.success(userService.removeById(id));
    }
}
