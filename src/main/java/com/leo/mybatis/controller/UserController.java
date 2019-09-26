package com.leo.mybatis.controller;

import com.leo.mybatis.dao.entity.User;
import com.leo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author Leo Liu */
@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired private UserService userService;

  @GetMapping("{id}")
  public User findUserById(@PathVariable("id") Integer userId) {
    return userService.getUserById(userId);
  }
}
