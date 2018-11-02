package com.syaccp.easybuy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syaccp.easybuy.entity.News;
import com.syaccp.easybuy.mapper.NewsMapper;

@Service("newsService")
public class NewsServiceImpl implements NewsService {
	
	@Resource
	private NewsMapper newsMapper;
	
	
	
	public NewsServiceImpl() {
		super();
		System.out.println("NewsServiceImpl");
	}

	
	
	@Override
	public void  insert(News record){
		newsMapper.insert(record);
		
	}


	@Override
	public List<News> findAll() {
		
		return newsMapper.findAll();
	}
	
	@Override
	public PageInfo<News> page(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<News> list = newsMapper.findAll();
		PageInfo<News> page  =new PageInfo<News>(list);
		return page;
	}

}
