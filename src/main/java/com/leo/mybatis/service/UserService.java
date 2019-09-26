package com.leo.mybatis.service;

import com.leo.mybatis.dao.entity.User;

/** @author Leo Liu */
public interface UserService {
  User getUserById(int userId);

  void addUser(User record);
}
