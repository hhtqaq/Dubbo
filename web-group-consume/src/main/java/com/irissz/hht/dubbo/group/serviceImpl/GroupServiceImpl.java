package com.irissz.hht.dubbo.group.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irissz.hht.dubbo.group.service.GroupService;
import com.irissz.hht.dubbo.person.service.PersonService;
@Service
public class GroupServiceImpl implements GroupService {

	// 面向接口编程 这是失败的 因为我们只是把接口引用过来 具体实现还在服务提供者那里
	@Autowired
	PersonService personService;

	public void getMemberList(Long grpId) {
		// 根据grpId查询到人员psnId
		List<Long> psnIds = new ArrayList<Long>();
		psnIds.add(1L);
		psnIds.add(2L);
		// 2根据psnid查询人员信息
		// 之前都是直接在pom.xml里面 依赖进来 单体应用模式
		// 现在这个web-group还在另一个服务器上 所以这样不可以
		for (Long psnId : psnIds) {
			System.out.println(personService.findByPsnId(psnId));
		}
	}
}
