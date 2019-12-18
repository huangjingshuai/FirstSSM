package com.hjs.test;

import java.lang.reflect.Method;

/**
 * Package: com.hjs.test
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/11/11 15:46
 */
public class MyLoggerImpl implements MyLogger {
    public void saveIntoMethodTime(Method method){
        System.out.println("进入"+method.getName()+"方法时间为:"+System.currentTimeMillis());
    }
    public void saveOutMethodTime(Method method){
        System.out.println("退出"+method.getName()+"方法时间为:"+System.currentTimeMillis());
    }
}
