package com.irissz.hht.dubbo.person.bean;

import java.io.Serializable;

/**
 * person类
 * @author hht
 *
 */
public class Person implements Serializable{
	 private static final long serialVersionUID = -4511234749832281474L;
	  // 用户编码
	  private Long personId;
	  // 用户中文名
	  private String name;
	  // 用户英文名
	  private String ename;
	  // 用户电话
	  private String tel;
	  // 用户移动电话号码
	  private String mobile;
	  // 用户电子邮箱
	  private String email;
	  
	  public Person() {
		super();
	}
	public Person(Long personId, String name, String ename, String tel, String mobile, String email) {
		super();
		this.personId = personId;
		this.name = name;
		this.ename = ename;
		this.tel = tel;
		this.mobile = mobile;
		this.email = email;
	}
	public Long getPersonId() {
			return personId;
		}
		public void setPersonId(Long personId) {
			this.personId = personId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Person [personId=" + personId + ", name=" + name + ", ename=" + ename + ", tel=" + tel + ", mobile="
					+ mobile + ", email=" + email + "]";
		}
		
		
}
