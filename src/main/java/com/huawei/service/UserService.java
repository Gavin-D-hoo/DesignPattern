package com.huawei.service;

import com.huawei.domain.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();

    User getUserById(Long userId);

    void saveUser(User user);

    void updateUser(User user);

    void removeUser(Long userId);
}