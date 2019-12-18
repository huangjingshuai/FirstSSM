package com.hjs.test;

import java.lang.reflect.Method;

public interface MyLogger {
    /**
     * 记录进入方法时间
     */
    void saveIntoMethodTime(Method method);
    /**
     * 记录退出方法时间
     */
    void saveOutMethodTime(Method method);
}
