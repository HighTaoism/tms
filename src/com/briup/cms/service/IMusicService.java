package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Music;

public interface IMusicService {
	void add(Music music);
	
	List<Music> list();
	
	void delete(long id);
	
	Music scanner(long id);
	 
	 //通过id获取音乐信息
	Music findById(long id);
	
	//修改音乐信息
	void update(Music music);

}
