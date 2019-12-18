package com.hjs.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Package: com.hjs.proxy
 * <p>
 * Description： 日志拦截（切面）
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/11/13 19:49
 */
@Aspect
@Component
public class LogInterceptor {
    @Before(value = "execution(* com.hjs.controller.*.*(..))")
    public void before(){
        System.out.println("进入方法的时间:"+System.currentTimeMillis());
    }
    @After(value = "execution(* com.hjs.controller.*.*(..))")
    public void after(){
        System.out.println("退出方法的时间:"+System.currentTimeMillis());
    }
}
