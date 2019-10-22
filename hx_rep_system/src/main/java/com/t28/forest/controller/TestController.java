/**
 * @description 测试控制器
 * @author XiangYuFeng
 * @create 2019/10/10
 * @since 1.0.0
 */
package com.t28.forest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "张三");
        return "hello";
    }

}