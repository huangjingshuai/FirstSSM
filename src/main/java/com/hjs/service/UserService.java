package com.hjs.service;

import com.hjs.model.User;
import org.apache.ibatis.session.RowBounds;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByName(String name);
    int insert(User user);
    int update(User user);
    int deleteByName(String string);
    List<User> findByNameAndPassword(String name,String password);
    List<User> findByIds(ArrayList ids);
}
