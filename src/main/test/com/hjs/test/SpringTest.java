package com.hjs.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Package: com.hjs
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/10/29 16:18
 */
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        //获取上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取SpringTest类
        SpringTest springTest=(SpringTest) applicationContext.getBean("springTest");
        //调用sayHello方法
        springTest.sayHello();

    }
    public void sayHello(){
        System.out.println("hello hjs");
    }
}
