package com.huawei.dao.impl;

import com.huawei.Mapper.UserMapper;
import com.huawei.dao.UserDAO;
import com.huawei.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * USERDAO用户管理dao层
 *
 * @author gavin
 * @date 2021-10-16
 */
@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private UserMapper userMapper;

    public List<User> listUsers() {
        return userMapper.listUsers();
    }


    public User getUserById(Long userId) {
        return userMapper.getUserById(userId);
    }

    public void saveUser(User user) {
        userMapper.saveUser(user);
    }


    public void updateUser(User user) {
        userMapper.updateUser(user);
    }


    public void removeUser(Long userId) {
        userMapper.removeUser(userId);
    }
}