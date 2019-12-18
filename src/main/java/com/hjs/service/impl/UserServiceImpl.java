package com.hjs.service.impl;

import com.hjs.dao.UserDao;
import com.hjs.model.User;
import com.hjs.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Package: com.hjs.service.impl
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/10/30 16:37
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    public List<User> findAll(){
        return  userDao.findAll();
    }
    public User findByName(String name){
        return  userDao.findByName(name);
    }
    public int insert(User user){
        return  userDao.insert(user);
    }
    public  int update(User user){
        return  userDao.update(user);
    }
    public  int deleteByName(String name){
        return  userDao.deleteByName(name);
    }
    public List<User> findByNameAndPassword(String name,String password){
        return  userDao.findByNameAndPassword(name,password);
    }
    public List<User> findByIds(ArrayList ids){
        return  userDao.findByIds(ids);
    }
}
