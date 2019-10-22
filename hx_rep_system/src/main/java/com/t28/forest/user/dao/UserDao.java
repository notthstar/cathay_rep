package com.t28.forest.user.dao;

import com.t28.forest.user.entity.UserDTO;

/**
 * @author XiangYuFeng
 * @description 用户DAO层接口
 * @create 2019/10/14
 * @since 1.0.0
 */
public interface UserDao {

    /**
     * 通过条件查询用户
     * @return UserDTO
     */
    public UserDTO findUserByCondition(UserDTO userDTO);

}