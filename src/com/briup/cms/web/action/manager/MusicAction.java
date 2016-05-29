package com.briup.cms.web.action.manager;

import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Category;
import com.briup.cms.bean.Music;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.IMusicService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.briup.cms.service.impl.MusicServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class MusicAction extends ActionSupport{

	/**
	 * 音乐
	 */
	private static final long serialVersionUID = 1L;
	private List<Music> musicList;
	private ICategoryService categoryService = new CategoryServiceImpl();
	
	private IMusicService musicService = new MusicServiceImpl();
	private List<Category> categoryList;
	private Music music;
	
	private String m_name;
	private String author;
	private String content;
	private Long c_id;
	private Long id;
	/**
	 * 跳转到添加音乐界面
	 */
	@Action(value="toAddMusic",results=
		{@Result(name="success",location="/WEB-INF/jsp/manager/addMusic.jsp")})
	public String toAddMusic(){
		categoryList = categoryService.list();
		return "success";
	}
	
	/*
	 * 添加音乐
	 * */
	@Action(value="addMusic")
	public void addMusic(){
		Music music = new Music(null, m_name, author, content, new Date(), c_id);
		musicService.add(music);
	}
	
	/*
	 * 删除音乐
	 * */
	@Action(value="delMusic")
	public void delMusic(){
		musicService.delete(id);
	}
	
	/**
	 * 跳转到音乐修改界面
	 */
	@Action(value="toMusicManager",results=
		{@Result(name="success",location="/WEB-INF/jsp/manager/musicManager.jsp")})
	public String toMusicManager(){
		musicList = musicService.list();
		return "success";
	}
    /*
     * 跳转到修改音乐界面
     * */
	@Action(value="toUpdMusic",results=
		{@Result(name="success",location="/WEB-INF/jsp/manager/updMusic.jsp")})
	public String toUpdMusic(){
		categoryList = categoryService.list();
		music = musicService.findById(id);
		return "success";
	}
	
	/*
	 * 修改栏目
	 */
	@Action(value="updMusic")
	public void updMusic(){
		Music music = new Music();
		music.setId(id);
		music.setM_name(m_name);
		music.setAuthor(author);
		music.setContent(content);
		music.setC_id(c_id);
		//调用service
		musicService.update(music);
	}
	
	
	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
    
	public List<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getC_id() {
		return c_id;
	}

	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
	
    
}
