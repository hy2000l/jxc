package com.jxc.entity;

import java.util.Date;

/**
 * BasePartsCategory entity. @author MyEclipse Persistence Tools
 */

public class BasePartsCategory implements java.io.Serializable {

	// Fields

	private String code;
	private String pcode;
	private String categoryname;
	private String isshow;
	private String remarks;
	private String compcode;
	private Date adddate;
	private String adduser;
	private String addusername;
	private String addip;

	// Constructors

	/** default constructor */
	public BasePartsCategory() {
	}

	/** full constructor */
	public BasePartsCategory(String pcode, String categoryname, String isshow,
			String remarks, String compcode, Date adddate, String adduser,
			String addusername, String addip) {
		this.pcode = pcode;
		this.categoryname = categoryname;
		this.isshow = isshow;
		this.remarks = remarks;
		this.compcode = compcode;
		this.adddate = adddate;
		this.adduser = adduser;
		this.addusername = addusername;
		this.addip = addip;
	}

	// Property accessors

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPcode() {
		return this.pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getIsshow() {
		return this.isshow;
	}

	public void setIsshow(String isshow) {
		this.isshow = isshow;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCompcode() {
		return this.compcode;
	}

	public void setCompcode(String compcode) {
		this.compcode = compcode;
	}

	public Date getAdddate() {
		return this.adddate;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	public String getAdduser() {
		return this.adduser;
	}

	public void setAdduser(String adduser) {
		this.adduser = adduser;
	}

	public String getAddusername() {
		return this.addusername;
	}

	public void setAddusername(String addusername) {
		this.addusername = addusername;
	}

	public String getAddip() {
		return this.addip;
	}

	public void setAddip(String addip) {
		this.addip = addip;
	}

}