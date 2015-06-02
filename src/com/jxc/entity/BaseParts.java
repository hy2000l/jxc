package com.jxc.entity;

import java.util.Date;

/**
 * BaseParts entity. @author MyEclipse Persistence Tools
 */

public class BaseParts implements java.io.Serializable {

	// Fields

	private String partscode;
	private String partsname;
	private String spell;
	private String partscategory;
	private String partsbrand;
	private String partsno;
	private String partsgeneralpartsno;
	private String partsmodel;
	private String partsmodelold;
	private String partssize;
	private String partsweight;
	private String partsimg;
	private String partsunit;
	private Double saleprice;
	private Double costprice;
	private String isshow;
	private String remarks;
	private Date adddate;
	private String adduser;
	private String addusername;
	private String addip;
	private String compcode;

	// Constructors

	/** default constructor */
	public BaseParts() {
	}

	/** full constructor */
	public BaseParts(String partsname, String spell, String partscategory,
			String partsbrand, String partsno, String partsgeneralpartsno,
			String partsmodel, String partsmodelold, String partssize,
			String partsweight, String partsimg, String partsunit,
			Double saleprice, Double costprice, String isshow, String remarks,
			Date adddate, String adduser, String addusername, String addip,
			String compcode) {
		this.partsname = partsname;
		this.spell = spell;
		this.partscategory = partscategory;
		this.partsbrand = partsbrand;
		this.partsno = partsno;
		this.partsgeneralpartsno = partsgeneralpartsno;
		this.partsmodel = partsmodel;
		this.partsmodelold = partsmodelold;
		this.partssize = partssize;
		this.partsweight = partsweight;
		this.partsimg = partsimg;
		this.partsunit = partsunit;
		this.saleprice = saleprice;
		this.costprice = costprice;
		this.isshow = isshow;
		this.remarks = remarks;
		this.adddate = adddate;
		this.adduser = adduser;
		this.addusername = addusername;
		this.addip = addip;
		this.compcode = compcode;
	}

	// Property accessors

	public String getPartscode() {
		return this.partscode;
	}

	public void setPartscode(String partscode) {
		this.partscode = partscode;
	}

	public String getPartsname() {
		return this.partsname;
	}

	public void setPartsname(String partsname) {
		this.partsname = partsname;
	}

	public String getSpell() {
		return this.spell;
	}

	public void setSpell(String spell) {
		this.spell = spell;
	}

	public String getPartscategory() {
		return this.partscategory;
	}

	public void setPartscategory(String partscategory) {
		this.partscategory = partscategory;
	}

	public String getPartsbrand() {
		return this.partsbrand;
	}

	public void setPartsbrand(String partsbrand) {
		this.partsbrand = partsbrand;
	}

	public String getPartsno() {
		return this.partsno;
	}

	public void setPartsno(String partsno) {
		this.partsno = partsno;
	}

	public String getPartsgeneralpartsno() {
		return this.partsgeneralpartsno;
	}

	public void setPartsgeneralpartsno(String partsgeneralpartsno) {
		this.partsgeneralpartsno = partsgeneralpartsno;
	}

	public String getPartsmodel() {
		return this.partsmodel;
	}

	public void setPartsmodel(String partsmodel) {
		this.partsmodel = partsmodel;
	}

	public String getPartsmodelold() {
		return this.partsmodelold;
	}

	public void setPartsmodelold(String partsmodelold) {
		this.partsmodelold = partsmodelold;
	}

	public String getPartssize() {
		return this.partssize;
	}

	public void setPartssize(String partssize) {
		this.partssize = partssize;
	}

	public String getPartsweight() {
		return this.partsweight;
	}

	public void setPartsweight(String partsweight) {
		this.partsweight = partsweight;
	}

	public String getPartsimg() {
		return this.partsimg;
	}

	public void setPartsimg(String partsimg) {
		this.partsimg = partsimg;
	}

	public String getPartsunit() {
		return this.partsunit;
	}

	public void setPartsunit(String partsunit) {
		this.partsunit = partsunit;
	}

	public Double getSaleprice() {
		return this.saleprice;
	}

	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}

	public Double getCostprice() {
		return this.costprice;
	}

	public void setCostprice(Double costprice) {
		this.costprice = costprice;
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

	public String getCompcode() {
		return this.compcode;
	}

	public void setCompcode(String compcode) {
		this.compcode = compcode;
	}

}