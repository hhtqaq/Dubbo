package com.irissz.hht.dubbo.person.service;

import com.irissz.hht.dubbo.person.bean.Person;

/**
 * personService 
 * @author Administrator
 *
 */
public interface PersonService {

	/**
	 * ����id������Ա��Ϣ
	 * @param psnId
	 * @return
	 */
	public Person findByPsnId(Long psnId);
}
