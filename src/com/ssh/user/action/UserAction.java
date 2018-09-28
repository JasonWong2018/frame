package com.ssh.user.action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.user.domain.User;
import com.ssh.user.service.UserService;

@Namespace("/user")
@Results({ @Result(name = "success", location = "/WEB-INF/hello.jsp"),
})
public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5822094844002268107L;

	@Autowired
	private UserService userService;

	@Action("hello")
	public String hello() {
		System.out.println("hello");
		return "success";
	}

	@Action("addUser")
	public String addUser() {
		User user = new User();
		user.setName("marry");
		user.setAge(18);
		System.out.println(user.getName());
		userService.addUser(user);
		return null;
	}
}
