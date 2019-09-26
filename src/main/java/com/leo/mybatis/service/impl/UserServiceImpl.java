package com.leo.mybatis.service.impl;

import com.leo.mybatis.dao.entity.User;
import com.leo.mybatis.dao.mapper.UserMapper;
import com.leo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Leo Liu */
@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserMapper userMapper;

  @Override
  public User getUserById(int userId) {
    return userMapper.selectById(userId);
  }

  @Override
  public void addUser(User record) {
    userMapper.insert(record);
  }
}
