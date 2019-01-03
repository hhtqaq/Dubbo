package com.irissz.hht.dubbo.group.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irissz.hht.dubbo.group.service.GroupService;
import com.irissz.hht.dubbo.person.service.PersonService;
@Service
public class GroupServiceImpl implements GroupService {

	// ����ӿڱ�� ����ʧ�ܵ� ��Ϊ����ֻ�ǰѽӿ����ù��� ����ʵ�ֻ��ڷ����ṩ������
	@Autowired
	PersonService personService;

	public void getMemberList(Long grpId) {
		// ����grpId��ѯ����ԱpsnId
		List<Long> psnIds = new ArrayList<Long>();
		psnIds.add(1L);
		psnIds.add(2L);
		// 2����psnid��ѯ��Ա��Ϣ
		// ֮ǰ����ֱ����pom.xml���� �������� ����Ӧ��ģʽ
		// �������web-group������һ���������� ��������������
		for (Long psnId : psnIds) {
			System.out.println(personService.findByPsnId(psnId));
		}
	}
}
