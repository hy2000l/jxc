package com.jxc.service.impl;

import com.jxc.dao.BasePartsCategoryDao;
import com.jxc.dao.impl.BasePartsCategoryDaoImpl;
import com.jxc.entity.BasePartsCategory;
import com.jxc.entity.PageBean;

public class BasePartsCategoryServiceImpl {
	private BasePartsCategoryDao dao=new BasePartsCategoryDaoImpl();
	public PageBean getBasePartsCategory(String code,String pcode,int pageNo,int pageSize){
		
		return dao.findByCondition(code, pcode, pageNo, pageSize);
	}
	public int updateBasePartsCategory(BasePartsCategory category){
		return dao.update(category);
	}
}
