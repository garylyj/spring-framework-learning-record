package com.yaghi.learningTest;

import com.yaghi.learningTest.config.AppConfig;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author: liyajie
 * @Date:2020/1/317:05
 **/
public class ApplicationContextTest {
	public static void main(String[] args) {
		/* 扫描类,bean实例化 */
		//创建上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("================="+context.getBean("loginController"));
	}

}
