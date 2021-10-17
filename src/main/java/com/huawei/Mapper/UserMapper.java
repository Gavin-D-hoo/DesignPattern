package com.huawei.Mapper;

import com.huawei.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * UserMapper类
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有user信息
     *
     * @return 结果
     */
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "id", column = "id", id = true ),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    List<User> listUsers();

    /**
     * 根据UserId来进行查询
     *
     * @param userId User的ID号码
     * @return User信息
     */
    @Select("SELECT * FROM user WHERE id = #{userId}")
    @Results({
            @Result(property = "id", column = "id", id = true ),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    User getUserById(@Param("userId") Long userId);

    /**
     * 插入一条User信息
     *
     * @param user user信息
     */
    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    void saveUser(User user);

    /**
     * 更新用户信息
     *
     * @param user user信息
     */
    @Update("UPDATE user SET name=#{name}, age=#{age} WHERE id=#{userId}")
    void updateUser(User user);

    /**
     * 删除user信息
     *
     * @param userId 待删除的User信息
     */
    @Delete("DELETE FROM user WHERE id=#{userId}")
    void removeUser(@Param("userId") Long userId);
}