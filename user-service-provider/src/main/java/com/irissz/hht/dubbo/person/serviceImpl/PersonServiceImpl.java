package com.irissz.hht.dubbo.person.serviceImpl;


import org.springframework.stereotype.Service;

import com.irissz.hht.dubbo.person.bean.Person;
import com.irissz.hht.dubbo.person.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService{

	public Person findByPsnId(Long psnId) {
		if(psnId==1) {
			return new Person(1L, "уехЩ", "zhangsan", "111111", "15070883212", "haitaohuang@irissz.com");
		}
		return null;
	}

}
