package com.study.java.controller;

import com.study.java.domain.User;
import com.study.java.mapper.UserMapper;
import com.study.java.service.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: UserController
 * @Description: 用户控制层
 * @author: liusheng
 * @date: 2019-06-18 23:45
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-18   liusheng        v1.0.0          Modify reason
 */
@RestController
@RequestMapping("v1/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/getUser")
    public User getUser() {
        return userMapper.find(27);
    }

}
    