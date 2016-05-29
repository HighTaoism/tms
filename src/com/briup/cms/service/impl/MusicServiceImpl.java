package com.briup.cms.service.impl;

import java.util.List;

import com.briup.cms.bean.Music;
import com.briup.cms.dao.MusicDao;
import com.briup.cms.service.IMusicService;

public class MusicServiceImpl implements IMusicService{
    private MusicDao musicDao = new MusicDao();
	@Override
	public void add(Music music) {
		musicDao.save(music);
		
	}
	
	@Override
	public Music scanner(long id) {
		
		return null;
	}

	@Override
	public List<Music> list() {
		return musicDao.findAll();
	}
	@Override
    public void delete(long id) {
		musicDao.deleteById(id);
		}

	@Override
	public Music findById(long id) {
		
		return musicDao.findById(id);
	}

	@Override
	public void update(Music music) {
		musicDao.update(music);
	}
	
	}
