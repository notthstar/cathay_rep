package com.t28.forest.user.dao;

import com.t28.forest.user.entity.UserDTO;
import org.springframework.stereotype.Repository;

/**
 * @author XiangYuFeng
 * @description 用户DAO层接口
 * @create 2019/10/14
 * @since 1.0.0
 */
@Repository
public interface UserDao {

    /**
     * 通过条件查询用户
     * @return UserDTO
     */
    public UserDTO findUserByCondition(UserDTO userDTO);

    /**
     * 添加用户信息
     * @param userDTO
     * @return Integer
     */
    public Integer insertUser(UserDTO userDTO);

    /**
     * 根据ID修改用户信息
     * @param userDTO
     * @return Integer
     */
    public Integer updateUserById(UserDTO userDTO);

}