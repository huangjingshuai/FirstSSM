package com.hjs.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjs.dao.UserDao;
import com.hjs.model.User;
import com.mysql.cj.api.mysqla.io.PacketHeader;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Package: com.hjs.test
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/11/5 15:59
 */
public class UserDaoTest extends BaseJunit4Test {
    @Autowired
    UserDao userDao;
    @Test
    public void testUser(){
        //findByIds测试
       /* ArrayList ids=new ArrayList();
        ids.add(2);
        ids.add(3);
        List<User> userList=userDao.findByIds(ids);
        for(User user:userList)
        System.out.println(user.getName());*/
        //findByNameAndPassword测试
        /*List<User> userList=userDao.findByNameAndPassword("张三","123");
        for(User user:userList)
        System.out.println(user.getName()+user.getPassword());*/
        PageHelper.startPage(0,5);
        List<User> userList=userDao.findAll();
        PageInfo pageInfo=new PageInfo(userList);
        pageInfo.getPages();
    }
}

