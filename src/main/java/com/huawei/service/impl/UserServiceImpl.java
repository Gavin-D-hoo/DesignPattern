package com.huawei.service.impl;

import com.huawei.dao.UserDAO;
import com.huawei.domain.User;
import com.huawei.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    public List<User> listUsers() {
     return userDAO.listUsers();
   }

   public User getUserById(Long userId) {
     return userDAO.getUserById(userId);
   }

   public void saveUser(User user) {
     userDAO.saveUser(user);
   }

   public void updateUser(User user) {
     userDAO.updateUser(user);
   }

   public void removeUser(Long userId) {
     userDAO.removeUser(userId);
    }
}