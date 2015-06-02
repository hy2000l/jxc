package com.jxc.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class DocTools {
	private String templatePath="/template";
	private String templateFile;
	
	private Configuration config;

	public DocTools(String templatePath,String templateFile){
		this(templateFile);
		this.templatePath=templatePath;
	}
	public DocTools(String templateFile){
		this.templateFile=templateFile;
		config=new Configuration();
		config.setDefaultEncoding("utf-8");
	}
	
	public static void main(String[] args) {
		DocTools docTools=new DocTools("customer_template.ftl");
		Map<String,Object> dataMap=new HashMap<String,Object>();
		dataMap.put("phone", "13280998858");
		dataMap.put("code",SysTools.bulidBillNo("CUST"));
		dataMap.put("date", "2015-12-12");
		dataMap.put("name", "三一重工");
		dataMap.put("linkman", "张三");
		dataMap.put("fan", "232323");
		
		
		docTools.createDoc(dataMap, "c:\\customer.doc");
	}
	public void createDoc(Map<String,Object> dataMap,String saveDocFile){
		config.setClassForTemplateLoading(this.getClass(), templatePath);
		Template t=null;
		BufferedWriter bw=null;
		try {
			t=config.getTemplate(templateFile);
			bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(saveDocFile),"utf-8"));
			t.process(dataMap, bw);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
