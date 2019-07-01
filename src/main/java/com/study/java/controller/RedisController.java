package com.study.java.controller;

import com.study.java.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: RedisController
 * @Description: redis控制层
 * @author: liusheng
 * @date: 2019-06-18 22:56
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-18   liusheng        v1.0.0          Modify reason
 */
@RestController
@RequestMapping("/v1/redis")
public class RedisController {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Resource
    private RedisService redisService;

    @GetMapping("/setAndGetValue")
    @ResponseBody
    public String setAndGetValue(String name, String value) {
        redisTemplate.opsForValue().set(name, value);
        return redisTemplate.opsForValue().get(name);
    }

    @GetMapping("/setAndGetValue1")
    @ResponseBody
    public String setAndGetValue1(String name, String value) {
        redisService.set(name, value);
        return (String) redisService.get(name);
    }

}
    