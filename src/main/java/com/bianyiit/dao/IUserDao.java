package com.bianyiit.dao;

import com.bianyiit.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();
    @Insert("insert into user values(null,#{username},#{birthday},${sex},#{address})")
    void saveUser(User user);

}
