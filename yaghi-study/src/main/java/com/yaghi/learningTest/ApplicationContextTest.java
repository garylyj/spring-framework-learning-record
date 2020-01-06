package com.yaghi.learningTest;

import com.yaghi.learningTest.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author: liyajie
 * @Date:2020/1/317:05
 **/
public class ApplicationContextTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("================="+context.getBean("loginController"));
	}

}
