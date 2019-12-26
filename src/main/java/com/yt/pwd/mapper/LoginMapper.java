package com.yt.pwd.mapper;

import com.yt.pwd.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface LoginMapper {

    @Insert("insert into user(userName , pwd) values(#{userName},#{pwd})")
    int insert(User user);


    @Select("select * from user where userName=#{userName}")
    List<User> query(String userName);


}
