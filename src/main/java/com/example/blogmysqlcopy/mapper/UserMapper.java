package com.example.blogmysqlcopy.mapper;


import com.example.blogmysqlcopy.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id =#{id}")
    User findUserById(@Param("id") int id);

}
