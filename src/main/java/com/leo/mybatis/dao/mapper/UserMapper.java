package com.leo.mybatis.dao.mapper;

import com.leo.mybatis.dao.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Leo Liu
 * @create 23/09/2019
 *     <p>可以使用注解配置sql，也可以使用xml统一管理sql(功能更强大一点，可以动态拼接sql)，对于单表的操作还可以引进mybatis-plus等工具管理
 */
public interface UserMapper {

  //  @Delete("delete from t_user where id=#{id}")
  int deleteById(@Param("id") Integer id);

  //  @Insert("insert into t_user(user_name,password,age) values(#{user_name}, #{password},
  // #{age})")
  //  @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
  void insert(@Param("user") User user);

  //  @Select("select id, user_name, password, age from t_user where id = #{id}")
  User selectById(@Param("id") Integer id);

  //  @Update("update t_user set user_name=#{user_name}, password=#{password}, age=#{age} where
  // id=#{id}")
  int updateById(@Param("user") User user);

  int insertSelective(@Param("user") User user);

  int updateByIdSelective(@Param("user") User user);
}
