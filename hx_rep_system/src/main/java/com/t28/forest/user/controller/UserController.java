package com.t28.forest.user.controller;

import com.t28.forest.user.entity.UserDTO;
import com.t28.forest.user.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author XiangYuFeng
 * @description 用户表操作控制器
 * @create 2019/10/23
 * @since 1.0.0
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/toPage")
    public String toPage(String page) {
        return page;
    }

    @RequestMapping("/login")
    public String login(UserDTO userDTO, Model model, HttpSession session) {
        UserDTO user = userService.login(userDTO.getLoginName(), DigestUtils.md5Hex(userDTO.getPassword()));
        // 判断用户名或密码是否错误
        if (Objects.isNull(user)) {
            model.addAttribute("msg", "用户名或密码错误！");
            return "login";
        }
        session.setAttribute("user", user);
        return "index";
    }

    @RequestMapping("/register")
    public String register(UserDTO userDTO, Model model) {
        // 进行密码MD5加密
        userDTO.setPassword(DigestUtils.md5Hex(userDTO.getPassword()));
        boolean result = userService.register(userDTO);
        // 成功，则返回到登陆页面
        if (result) {
            model.addAttribute("loginName", userDTO.getLoginName());
            return "login";
        }
        // 否则返回注册页面
        return "register";
    }

    @RequestMapping("/uptPwd")
    public String updatePwd(UserDTO userDTO, String oldPwd, HttpSession session, Model model) {
        // 判断用户输入是否为空
        if (Objects.isNull(oldPwd) || Objects.isNull(userDTO) || Objects.isNull(userDTO.getPassword())) {
            model.addAttribute("msg", "密码不能为空！");
            return "updatepwd";
        }
        // 从session中获取用户的旧密码
        UserDTO user = (UserDTO) session.getAttribute("user");
        // 判断用户输入的旧密码是否正确
        if (!oldPwd.equals(user.getPassword())) {
            model.addAttribute("msg", "旧密码错误！");
            return "updatepwd";
        }
        // 更新session中的用户数据，修改密码，返回主页
        user.setPassword(userDTO.getPassword());
        session.setAttribute("user", user);
        userService.updatePassWord(userDTO);
        return "index";
    }

    @RequestMapping("/userOut")
    public String userOut(HttpSession session) {
        // 清除session中的数据
        session.invalidate();
        return "login";
    }

}