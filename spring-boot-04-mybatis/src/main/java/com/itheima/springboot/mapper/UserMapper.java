package com.itheima.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.itheima.springboot.pojo.User;

@Mapper
public interface UserMapper {

	@Select("select * from tb_user where user_name like '%${name}%'")
	public List<User> queryUserByName(@Param("name") String name);

	// 使用UserMapper映射文件
	public List<User> queryUsers();
}
