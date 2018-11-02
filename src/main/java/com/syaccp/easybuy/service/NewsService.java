package com.syaccp.easybuy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.syaccp.easybuy.entity.News;

public interface NewsService {

	void insert(News record);
	
	List<News> findAll();

	public PageInfo<News> page(int pageNo,int pageSize);
}