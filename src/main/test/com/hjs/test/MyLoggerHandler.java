package com.hjs.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Package: com.hjs.test
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/11/11 15:52
 */
public class MyLoggerHandler implements InvocationHandler{
    //原始对象
    private Object objOriginal;
    private MyLogger myLogger=new MyLoggerImpl();
    public MyLoggerHandler(Object obj){
        super();
        this.objOriginal=obj;
    }
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable{
        Object result=null;
        //日志方法，保存进入方法的时间
        myLogger.saveIntoMethodTime(method);
        //调用代理方法
        result=method.invoke(this.objOriginal,args);
        //日志类方法，保存退出方法的时间
        myLogger.saveOutMethodTime(method);
        return result;
    }
}
