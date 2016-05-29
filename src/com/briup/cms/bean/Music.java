package com.briup.cms.bean;

import java.util.Date;

/*
 * 音乐类
 * @author HighTaoism
 **/
public class Music {
	private Long id;
	private String M_name;  //音乐名称
	private String author;  //作者
	private String content;   //音乐简述
	private Date publisurdate;  //发布日期
	private Long c_id;  //栏目的id，是一个外键
	
	public Music(){
		
	}
	
	
	public Music(Long id, String m_name, String author, String content,
			Date publisurdate, Long c_id) {
		super();
		this.id = id;
		M_name = m_name;
		this.author = author;
		this.content = content;
		this.publisurdate = publisurdate;
		this.c_id = c_id;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getM_name() {
		return M_name;
	}
	public void setM_name(String m_name) {
		M_name = m_name;
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
	public Date getPublisurdate() {
		return publisurdate;
	}
	public void setPublisurdate(Date publisurdate) {
		this.publisurdate = publisurdate;
	}
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}

	
}
