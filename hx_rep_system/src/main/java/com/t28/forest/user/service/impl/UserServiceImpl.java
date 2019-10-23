package com.t28.forest.user.service.impl;

import com.t28.forest.user.dao.UserDao;
import com.t28.forest.user.entity.UserDTO;
import com.t28.forest.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author XiangYuFeng
 * @description 用户业务逻辑层实现
 * @create 2019/10/23
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDTO login(String userName, String password) {
        UserDTO user = userDao.findUserByCondition(new UserDTO(userName, password));
        // 判断用户和用户的ID是否为空
        if (Objects.isNull(user) && Objects.isNull(user.getId())) {
            return null;
        }
        return user;
    }

    @Override
    public Boolean register(UserDTO userDTO) {
        return null;
    }
}