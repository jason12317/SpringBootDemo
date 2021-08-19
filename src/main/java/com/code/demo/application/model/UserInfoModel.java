package com.code.demo.application.model;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class UserInfoModel  implements Serializable {

	private static final long serialVersionUID = 1248614186951249853L;
	private int id;
	private String email;
	private String password;
	private String pic;
	private String acctDesc;
	private String address;
	private Date create_date;
 
	public int getId() {
		return id;
	}
  
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
  
    public void setEmail(String email) {
    	this.email = email;
    }

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPic() {
		return pic;
	}
	
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	public String getAcctDesc() {
		return acctDesc;
	}
	
	public void setAcctDesc(String acctDesc) {
		this.acctDesc = acctDesc;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getCreate_date() {
		return create_date;
	}
	
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	  

}
