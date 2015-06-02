package com.jxc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jxc.dao.BaseDao;
import com.jxc.dao.BasePartsCategoryDao;
import com.jxc.entity.BasePartsCategory;
import com.jxc.entity.PageBean;

public class BasePartsCategoryDaoImpl extends BaseDao implements
		BasePartsCategoryDao {

	public PageBean find(int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		return findByCondition(null, null, pageNo, pageSize);
	}

	public PageBean findByCondition(String code, String pcode,int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		String sql="select * from BASEPARTSCATEGORY where 1=1";
		List params=new ArrayList();
		List<BasePartsCategory> dataList=new ArrayList<BasePartsCategory>(); 
		if(code!=null&&!code.equals("")){
			sql+=" and code=?";
			params.add(code);
		}
		if(pcode!=null&&!pcode.equals("")){
			sql+=" and pcode=?";
			params.add(pcode);
		}
		PageBean pb=new PageBean();
		Object[] paramArr1=params.toArray();
		params.add(pageNo*pageSize);
		params.add((pageNo-1)*pageSize);
		Object[] paramArr2=params.toArray();
		ResultSet rs=super.executeQueryForPage(sql,paramArr2);
		BasePartsCategory category=null;
		try {
			while(rs.next()){
				category=new BasePartsCategory();
				category.setCode(rs.getString("code"));
				category.setCategoryname(rs.getString("CATEGORYNAME"));
				category.setAdddate(rs.getDate("Adddate"));
				category.setAdduser(rs.getString("adduser"));
				category.setRemarks(rs.getString("remarks"));
				category.setIsshow(rs.getString("isshow"));
				dataList.add(category);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll();
		}
		
		pb.setData(dataList);
		sql="select count(*) "+sql.substring(sql.indexOf("from"));
		pb.setRecordCount(super.executeTotalCount(sql, paramArr1));
		return pb;
	}

	public int insert(BasePartsCategory category) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(BasePartsCategory category) {
		// TODO Auto-generated method stub
		String sql="update basepartscategory set pcode=?,categoryname=?,isshow=?,remarks=?" +
				" where code=?";
		return super.executeUpdate(sql,new Object[]{category.getPcode(),category.getCategoryname(),
				category.getIsshow(),category.getRemarks(),category.getCode()});
	}

	public BasePartsCategory findByCode(String code) {
		// TODO Auto-generated method stub
		String sql="select * from basepartscategory where code=?";
		ResultSet rs=super.executeQuery(sql,code);
		BasePartsCategory category=null;
		try {
			if(rs.next()){
				category=new BasePartsCategory();
				category.setCode(rs.getString("code"));
				category.setCategoryname(rs.getString("CATEGORYNAME"));
				category.setAdddate(rs.getDate("Adddate"));
				category.setAdduser(rs.getString("adduser"));
				category.setRemarks(rs.getString("remarks"));
				category.setIsshow(rs.getString("isshow"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.closeAll();
		}
		return category;
	}

}
