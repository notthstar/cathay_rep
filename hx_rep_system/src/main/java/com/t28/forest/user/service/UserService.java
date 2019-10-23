package com.t28.forest.user.service;

import com.t28.forest.user.entity.UserDTO;

/**
 * @author XiangYuFeng
 * @description 用户业务路径层接口
 * @create 2019/10/23
 * @since 1.0.0
 */
public interface UserService {

    /**
     * 用户登录的方法
     * @param userName
     * @param password
     * @return UserDTO
     */
    public UserDTO login(String userName, String password);

    /**
     * 用户注册的方法
     * @param userDTO
     * @return Boolean
     */
    public Boolean register(UserDTO userDTO);

}