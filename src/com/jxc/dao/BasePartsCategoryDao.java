package com.jxc.dao;

import com.jxc.entity.BasePartsCategory;
import com.jxc.entity.PageBean;

public interface BasePartsCategoryDao {
	public PageBean find(int pageNo,int pageSize);
	public PageBean findByCondition(String categoryNo,String parentNo,int pageNo,int pageSize);
	public int insert(BasePartsCategory category);
	public int update(BasePartsCategory category);
	
	public BasePartsCategory findByCode(String code);
	
}