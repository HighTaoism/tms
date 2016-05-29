package com.briup.cms.web.action.manager;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;


public class CatergoryAction extends ActionSupport{

	/**
	 * author HighTaoism
	 */
	private static final long serialVersionUID = 1L;
	private List<Category> categoryList;
	private Long id;
	private String name;
	private Integer code;
	
	private ICategoryService categoryService = new CategoryServiceImpl();
	
	/**
	 * 跳转到栏目的添加界面
	 */
	@Action(value="toAddCategory",results=
		{@Result(name="success",location="/WEB-INF/jsp/manager/addCategory.jsp")})
	public String toAddCategory(){
		return "success";
	}

	
	/**
	 * 跳转到栏目的管理界面
	 */
	@Action(value="toCategoryManager",results=
		{@Result(name="success",location="/WEB-INF/jsp/manager/categoryManager.jsp")})
	public String toCategoryManager(){
		categoryList = categoryService.list();
		return "success";
	}
	
	/**
	 * 跳转到添加栏目应用界面
	 */
	@Action(value="addCategory")
	public void addCategory(){
		Category catgory = new Category(name, code);
		categoryService.add(catgory);
	}

	/**
	 * 跳转到删除栏目应用界面
	 */
	@Action(value="delCategory")
	public void delCategory(){
		categoryService.delete(id);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<Category> getCategoryList() {
		return categoryList;
	}


	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	

}
