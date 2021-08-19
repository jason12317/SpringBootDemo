package com.code.demo.application.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinfo")
public class UserInfoPersistence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="PIC")
	private String pic;
	@Column(name="ACCTDESC")
	private String acctDesc;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CREATE_DATE")
	private Date create_date;
 

	public long getId() {
		return id;
	}
  
	public void setId(long id) {
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
