package com.hjs.dao;

import com.hjs.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserDao {
    List<User> findAll();//查找全部用户
    User findByName(String name);//按名字查找指定用户
    int insert(User user);//添加数据
    int update(User user);//更新数据
    int deleteByName(String string);//删除数据
    List<User> findByNameAndPassword(@Param("name") String name, @Param("password") String password);//通过姓名和密码查找用户
    List<User> findByIds(@Param("Ids") ArrayList ids);//根据Id集合查找用户列表
}
