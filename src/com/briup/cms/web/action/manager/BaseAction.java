package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{

	/**
	 * 跳转到后台界面
	 */
	private static final long serialVersionUID = 1L;

	@Action(value="toIndex",results=
		{@Result(name="success",location="/WEB-INF/jsp/manager/index.jsp")})
	public String toIndex(){
		return "success";
	}
	
}
