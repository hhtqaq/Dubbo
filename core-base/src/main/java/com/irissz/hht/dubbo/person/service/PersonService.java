package com.irissz.hht.dubbo.person.service;

import com.irissz.hht.dubbo.person.bean.Person;

/**
 * personService 
 * @author Administrator
 *
 */
public interface PersonService {

	/**
	 * 根据id查找人员信息
	 * @param psnId
	 * @return
	 */
	public Person findByPsnId(Long psnId);
}
