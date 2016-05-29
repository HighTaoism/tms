package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Category;

/**
 * 提供栏目管理业务逻辑
 * */
public interface ICategoryService {
	//添加栏目
	void add(Category category);
    //列出所有栏目
	List<Category> list();
	
	//删除栏目由id
	void delete(long id);
}
