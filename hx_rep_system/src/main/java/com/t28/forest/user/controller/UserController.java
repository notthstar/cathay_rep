package com.t28.forest.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XiangYuFeng
 * @description 用户表操作控制器
 * @create 2019/10/23
 * @since 1.0.0
 */
@Controller
public class UserController {

    @RequestMapping("/toPage")
    public String toPage(String page) {
        return page;
    }

}