package com.hjs.test;

import java.lang.reflect.Proxy;

/**
 * Package: com.hjs.test
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/11/11 16:01
 */
public class MyLoggerTest {
    public static void main(String args[]){
        //实例化真实项目中的业务类
        BusinessClassService businessClassService=new BusinessClassServiceImpl();
        //日志类中的handler
        MyLoggerHandler myLoggerHandler=new MyLoggerHandler(businessClassService);
        //获得代理对象
        BusinessClassService businessClass=(BusinessClassService)Proxy.newProxyInstance(businessClassService.getClass().getClassLoader(),businessClassService.getClass().getInterfaces(),myLoggerHandler);
       //执行代理方法
        businessClass.doSomeThing();
    }
}
