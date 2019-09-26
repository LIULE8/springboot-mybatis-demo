package com.leo.mybatis.dao.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Leo Liu
 * @create 23/09/2019
 */
@Getter
@Setter
public class User implements Serializable {
  private static final long serialVersionUID = 5505607785625771252L;
  private Integer id;
  private String userName;
  private String password;
  private Integer age;
}
