package com.huawei.controller;

import com.huawei.domain.User;
import com.huawei.service.UserService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    // GET请求代表着是查询数据
    @GetMapping("/")
    public List<User> listUsers() {
        return userService.listUsers();
    }

    // GET请求+{id}代表的是查询某个用户
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long userId) {
        return userService.getUserById(userId);
    }

    // POST请求代表着是新增数据
    @PostMapping("/")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "success";
    }

    // PUT请求代表的是更新
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Long userId, User user) {
        user.setId(userId);
        userService.updateUser(user);
        return "success";
    }

    // DELETE请求代表的是删除
    @Delete("/{id}")
    public String deleteUser(@PathVariable("id") Long userId) {
        userService.removeUser(userId);
        return "success";
    }
}