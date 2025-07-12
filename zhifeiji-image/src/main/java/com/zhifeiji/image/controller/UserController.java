package com.zhifeiji.image.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zhifeiji.image.common.R;
import com.zhifeiji.image.dto.req.UserReq;
import com.zhifeiji.image.entity.User;
import com.zhifeiji.image.service.UserService;
import com.zhifeiji.image.utils.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get/{nickname}")
    public R<User> getUser(@PathVariable("nickname") String nickname) {
        if (StringUtils.isBlank(nickname)) {
            return R.error("nickname is empty");
        }
        return R.success(userService.getUserByNickname(nickname));
    }


    @PostMapping("/sendMsg")
    public R<String> sendMsg(@RequestBody User user, HttpSession session) {
        //获取手机号
        String phone = user.getPhone();
        if (StringUtils.isNotEmpty(phone)) {
            //生成随机的4位验证码
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            log.info("验证码code：{}", code);
            //调用阿里云提供的短信服务API发送短信
//            SMSUtils.sendMessage("喵九匠","",phone,code);
            //将验证码保存到session中
            session.setAttribute(phone, code);
            return R.success("验证码发送成功！");
        }
        return R.error("短信发送失败！");
    }

    @PostMapping("/login")
    public R<User> login(@RequestBody Map map, HttpSession session) {

        log.info("接收登录数据：{}", map.toString());
        //获取手机号
        String phone = map.get("phone").toString();
        //获取验证码
        String code = map.get("code").toString();
        //从session中获取保存的验证码进行比对
        String codeInSession = (String) session.getAttribute(phone);
        //比对成功，允许登录
        if (codeInSession != null && codeInSession.equals(code)) {

            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(User::getPhone, phone);
            User user = userService.getOne(queryWrapper);
            //判断是否为新用户，若是新用户自动完成注册
            if (user == null) {
                //新用户注册
                user = new User();
                user.setPhone(phone);
                user.setStatus(1);
                userService.save(user);
            }
            session.setAttribute("user", user.getId());
            return R.success(user);
        }
        return R.error("登录失败！");
    }
}
