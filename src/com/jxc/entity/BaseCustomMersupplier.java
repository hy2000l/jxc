package com.jxc.entity;

import java.util.Date;


/**
 * BaseCustomMersupplier entity. @author MyEclipse Persistence Tools
 */

public class BaseCustomMersupplier  implements java.io.Serializable {


    // Fields    

     private String code;
     private String categorycode;
     private Date adddate;
     private String csname;
     private String spell;
     private String contacter;
     private String telephone;
     private String mobilephone;
     private String fax;
     private String email;
     private String url;
     private String address;
     private String province;
     private String city;
     private String qq;
     private String postcode;
     private String msn;
     private String account;
     private String aliwang;
     private String bank;
     private String legaler;
     private String tax;
     private String agent;
     private String isshow;
     private String remarks;
     private String adduser;
     private String addusername;
     private String addip;
     private String compcode;


    // Constructors

    /** default constructor */
    public BaseCustomMersupplier() {
    }

	/** minimal constructor */
    public BaseCustomMersupplier(String code) {
        this.code = code;
    }
    
    /** full constructor */
    public BaseCustomMersupplier(String code, String categorycode, Date adddate, String csname, String spell, String contacter, String telephone, String mobilephone, String fax, String email, String url, String address, String province, String city, String qq, String postcode, String msn, String account, String aliwang, String bank, String legaler, String tax, String agent, String isshow, String remarks, String adduser, String addusername, String addip, String compcode) {
        this.code = code;
        this.categorycode = categorycode;
        this.adddate = adddate;
        this.csname = csname;
        this.spell = spell;
        this.contacter = contacter;
        this.telephone = telephone;
        this.mobilephone = mobilephone;
        this.fax = fax;
        this.email = email;
        this.url = url;
        this.address = address;
        this.province = province;
        this.city = city;
        this.qq = qq;
        this.postcode = postcode;
        this.msn = msn;
        this.account = account;
        this.aliwang = aliwang;
        this.bank = bank;
        this.legaler = legaler;
        this.tax = tax;
        this.agent = agent;
        this.isshow = isshow;
        this.remarks = remarks;
        this.adduser = adduser;
        this.addusername = addusername;
        this.addip = addip;
        this.compcode = compcode;
    }

   
    // Property accessors

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getCategorycode() {
        return this.categorycode;
    }
    
    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode;
    }

    public Date getAdddate() {
        return this.adddate;
    }
    
    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getCsname() {
        return this.csname;
    }
    
    public void setCsname(String csname) {
        this.csname = csname;
    }

    public String getSpell() {
        return this.spell;
    }
    
    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getContacter() {
        return this.contacter;
    }
    
    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobilephone() {
        return this.mobilephone;
    }
    
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getQq() {
        return this.qq;
    }
    
    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPostcode() {
        return this.postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getMsn() {
        return this.msn;
    }
    
    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getAccount() {
        return this.account;
    }
    
    public void setAccount(String account) {
        this.account = account;
    }

    public String getAliwang() {
        return this.aliwang;
    }
    
    public void setAliwang(String aliwang) {
        this.aliwang = aliwang;
    }

    public String getBank() {
        return this.bank;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getLegaler() {
        return this.legaler;
    }
    
    public void setLegaler(String legaler) {
        this.legaler = legaler;
    }

    public String getTax() {
        return this.tax;
    }
    
    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getAgent() {
        return this.agent;
    }
    
    public void setAgent(String agent) {
        this.agent = agent;
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