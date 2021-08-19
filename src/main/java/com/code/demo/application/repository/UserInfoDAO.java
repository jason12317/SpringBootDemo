package com.code.demo.application.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ArgumentPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.demo.application.model.UserInfoModel;

@Repository
public class UserInfoDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addUser(UserInfoModel userInfoModel){
		System.out.println("EXCUTE INSERT MEMBER");
		System.out.println(new ArgumentPreparedStatementSetter(new Object[] {userInfoModel.getId(), userInfoModel.getEmail() ,userInfoModel.getPassword(),
	  			userInfoModel.getPic(),userInfoModel.getAcctDesc(),userInfoModel.getAddress()}));
	  jdbcTemplate.update("INSERT INTO userinfo(ID, EMAIL, PASSWORD, PIC, ACCTDESC, ADDRESS, CREATE_DATE) "
	  		+ "VALUES (?,?,?,?,?,?,NOW())",userInfoModel.getId(), userInfoModel.getEmail() ,userInfoModel.getPassword(),
	  			userInfoModel.getPic(),userInfoModel.getAcctDesc(),userInfoModel.getAddress()
	  		 );
	}
}
