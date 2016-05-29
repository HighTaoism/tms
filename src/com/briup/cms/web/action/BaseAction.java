package com.briup.cms.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	private List<Category> categoryList;
	
	private ICategoryService categoryService = new CategoryServiceImpl(); 
	
	/**
	 * 跳转到前台界面
	 * */
	@Action(value="toIndex",results=
		{@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toIndex(){
		categoryList = categoryService.list();
		return "success";
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

}
