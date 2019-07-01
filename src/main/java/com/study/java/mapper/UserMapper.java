package com.study.java.mapper;

import com.study.java.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @InterfaceName: UserMapper
 * @Description: 用户mapper接口
 * @author: liusheng
 * @date: 2019-06-18 23:34
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-18   liusheng        v1.0.0          Modify reason
 */
@Mapper
public interface UserMapper {

    @Insert("insert user(name, age) values(#{name}, #{age})")
    void insert(User u);

    @Update("update user set name = #{name} where age=#{age} ")
    void update(User u);

    @Delete("delete from user where age=#{age} ")
    void delete(@Param("id") String id);

    @Select("select name,age from user where age=#{age} ")
    User find(@Param("age") int age);

    //注：方法名和要UserMapper.xml中的id一致
    List<User> query(@Param("name") String name);

    @Delete("delete from user")
    void deleteAll();

}
    