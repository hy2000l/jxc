package com.jxc.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import com.jxc.entity.PageBean;
import com.jxc.service.impl.BasePartsCategoryServiceImpl;
import com.jxc.util.JSONDateProcessor;

public class ManageBasePartCategoryServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManageBasePartCategoryServlet() {
		super();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			this.doGet(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	private BasePartsCategoryServiceImpl basePartsCategoryServiceImpl=new BasePartsCategoryServiceImpl();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/json; charset=utf-8");
		String pageNo=request.getParameter("page");
		String pageSize=request.getParameter("rows");
		if(pageNo==null||pageNo.equals("")) pageNo="1";
		if(pageSize==null||pageSize.equals("")) pageSize="1";
		String code=request.getParameter("code");
		String pcode=request.getParameter("pcode");
		PageBean pb=basePartsCategoryServiceImpl.getBasePartsCategory(code, pcode, Integer.parseInt(pageNo), Integer.parseInt(pageSize));
		JsonConfig config=new JsonConfig();
		config.registerJsonValueProcessor(Date.class, new JSONDateProcessor());
		JSONObject jsonobj=new JSONObject();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("rows", pb.getData());
		map.put("total", pb.getRecordCount());
		jsonobj.putAll(map, config);
		response.getWriter().println(jsonobj.toString());
	}

}
