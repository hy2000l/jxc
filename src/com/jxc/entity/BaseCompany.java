package com.jxc.entity;

import java.util.Date;

/**
 * BaseCompany entity. @author MyEclipse Persistence Tools
 */

public class BaseCompany implements java.io.Serializable {

	// Fields

	private String code;
	private String compname;
	private String compaddress;
	private String comppostcode;
	private String compphone;
	private String compfax;
	private String compurl;
	private String compemail;
	private String complegaler;
	private String compagent;
	private String compaccount;
	private String compbank;
	private String comptax;
	private String remarks;
	private String isshow;
	private Date adddate;
	private String complogo;
	private String adduser;
	private String addusername;
	private String addip;

	// Constructors

	/** default constructor */
	public BaseCompany() {
	}

	/** minimal constructor */
	public BaseCompany(String code) {
		this.code = code;
	}

	/** full constructor */
	public BaseCompany(String code, String compname, String compaddress,
			String comppostcode, String compphone, String compfax,
			String compurl, String compemail, String complegaler,
			String compagent, String compaccount, String compbank,
			String comptax, String remarks, String isshow, Date adddate,
			String complogo, String adduser, String addusername, String addip) {
		this.code = code;
		this.compname = compname;
		this.compaddress = compaddress;
		this.comppostcode = comppostcode;
		this.compphone = compphone;
		this.compfax = compfax;
		this.compurl = compurl;
		this.compemail = compemail;
		this.complegaler = complegaler;
		this.compagent = compagent;
		this.compaccount = compaccount;
		this.compbank = compbank;
		this.comptax = comptax;
		this.remarks = remarks;
		this.isshow = isshow;
		this.adddate = adddate;
		this.complogo = complogo;
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

	public String getCompname() {
		return this.compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getCompaddress() {
		return this.compaddress;
	}

	public void setCompaddress(String compaddress) {
		this.compaddress = compaddress;
	}

	public String getComppostcode() {
		return this.comppostcode;
	}

	public void setComppostcode(String comppostcode) {
		this.comppostcode = comppostcode;
	}

	public String getCompphone() {
		return this.compphone;
	}

	public void setCompphone(String compphone) {
		this.compphone = compphone;
	}

	public String getCompfax() {
		return this.compfax;
	}

	public void setCompfax(String compfax) {
		this.compfax = compfax;
	}

	public String getCompurl() {
		return this.compurl;
	}

	public void setCompurl(String compurl) {
		this.compurl = compurl;
	}

	public String getCompemail() {
		return this.compemail;
	}

	public void setCompemail(String compemail) {
		this.compemail = compemail;
	}

	public String getComplegaler() {
		return this.complegaler;
	}

	public void setComplegaler(String complegaler) {
		this.complegaler = complegaler;
	}

	public String getCompagent() {
		return this.compagent;
	}

	public void setCompagent(String compagent) {
		this.compagent = compagent;
	}

	public String getCompaccount() {
		return this.compaccount;
	}

	public void setCompaccount(String compaccount) {
		this.compaccount = compaccount;
	}

	public String getCompbank() {
		return this.compbank;
	}

	public void setCompbank(String compbank) {
		this.compbank = compbank;
	}

	public String getComptax() {
		return this.comptax;
	}

	public void setComptax(String comptax) {
		this.comptax = comptax;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getIsshow() {
		return this.isshow;
	}

	public void setIsshow(String isshow) {
		this.isshow = isshow;
	}

	public Date getAdddate() {
		return this.adddate;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	public String getComplogo() {
		return this.complogo;
	}

	public void setComplogo(String complogo) {
		this.complogo = complogo;
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