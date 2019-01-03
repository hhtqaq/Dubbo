package com.irissz.hht.dubbo.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试主方法
 * @author Administrator
 *
 */
public class Provider {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
	        context.start();
	        System.in.read(); // 按任意键退出
	}
}
