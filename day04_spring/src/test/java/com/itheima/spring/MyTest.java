package com.itheima.spring;

import com.itcast.Printer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

public class MyTest {

    @Test
    public void test1(){

        //启动spring容器,spring容器在启动时会读取beans.xml文件
        //根据bean.xml文件的配置在spring容器创建对象并保存到容器中
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Printer printer = (Printer)context.getBean("printer");
        printer.print();
    }
}
