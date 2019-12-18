package com.hjs.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjs.model.User;
import com.hjs.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Package: com.hjs
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/10/30 16:39
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags="用户接口",description = "User Controller",hidden = true)
public class UserController {
    @Resource
    private UserService userService;
    @ApiOperation(value="获取全部用户")
    @GetMapping(value = "/findAll", headers = "Accept=application/json")
    public List<User> findAll(){
        PageHelper.startPage(0,5);
        List<User> userList=userService.findAll();
        PageInfo pageInfo=new PageInfo(userList);
       /* for(User user:userList){
            System.out.println("id:"+user.getId());
            System.out.println("name:"+user.getName());
            System.out.println("password:"+user.getPassword());
        }*/
        return userList;
    }
    @ApiOperation(value="通过姓名获取用户信息")
    @GetMapping(value = "/findByName", headers = "Accept=application/json")
    public  User findByName(@RequestParam("name") String name){
        User user=userService.findByName(name);
        return user;
    }
    @GetMapping(value = "/fetch",params = {"personId=10"})
    public String getParams(@RequestParam("personId") String id){
        return "value1"+" id"+id;
    }
    @GetMapping(value = "/fetch",params = {"personId=20"})
    public String getParam(){
        return "value2";
    }
}
