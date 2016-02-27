package com.baidu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baidu.util.UserDao;
import com.baidu.util.UserDaoFactory;
import com.baidu.util.UserDaoImpl;

public class TestSpring {


	
	public static void test1()
	 {
	     ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	     UserDao userDao = (UserDao) ctx.getBean("userDaoImpl");
	     
	     userDao.save();
	     
	 }
	
	public static void main(String[] args) {
		TestSpring.test1();
		System.out.println("chenggongle");
	}
}
