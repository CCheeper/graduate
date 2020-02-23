package com.cxy.springcloud.dao;

import java.util.List;
import java.util.Map;


import com.cxy.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;

@Mapper
public interface UserDao
{
	public boolean addUser(User user);

	public User findById(int id);

	public List<User> findAll();

	public boolean deleteUser(int id);

	public List<User> findLimit(@Param("fnum")int fnum,@Param("bnum") int bnum);


}
