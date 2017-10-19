package com.ypy.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ypy.pojo.TUser;
import com.ypy.service.IUserService;

public class UserTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService user = ac.getBean(IUserService.class);
		List<TUser> list = user.query();
		for (TUser tUser : list) {
			System.out.println(tUser.getUsername());
		}
		
	}

}
