package com.irissz.hht.dubbo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.irissz.hht.dubbo.group.service.GroupService;

public class Consumer {
    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consume.xml");
        context.start();
        GroupService groupService = (GroupService)context.getBean("groupServiceImpl"); // ��ȡԶ�̷������
        groupService.getMemberList(1L);
        System.in.read();
    }
}