package com.irissz.hht.dubbo.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����������
 * @author Administrator
 *
 */
public class Provider {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
	        context.start();
	        System.in.read(); // ��������˳�
	}
}
