package com.huawei.dao;

import com.huawei.domain.User;

import java.util.List;

/**
 * 用户管理的dao
 *
 * @author gavin
 * @date 2021-10-16
 */
public interface UserDAO {
    /**
     * 查询所有user信息
     *
     * @return 结果
     */
    List<User> listUsers();

    /**
     * 根据UserId来进行查询
     *
     * @param userId User的ID号码
     * @return User信息
     */
    User getUserById(Long userId);

    /**
     * 插入一条User信息
     *
     * @param user user信息
     */
    void saveUser(User user);

    /**
     * 更新用户信息
     *
     * @param user user信息
     */
    void updateUser(User user);

    /**
     * 删除user信息
     *
     * @param userId 待删除的User信息
     */
    void removeUser(Long userId);
}