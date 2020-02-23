package com.cxy.springcloud.service;

import java.util.List;
import java.util.Map;

import com.cxy.springcloud.entities.User;
import org.json.JSONObject;

public interface UserService
{
	public boolean add(User user);

	public User get(int id);

	public List<User> list();

	public boolean delete(int id);

	public List<User> findLimit(int fnum,int bnum);

}
