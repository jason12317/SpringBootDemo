package com.code.demo.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.demo.application.model.UserInfoModel;
import com.code.demo.application.repository.UserInfoDAO;

@Service
public class UserInfoService {

	@Autowired
	UserInfoDAO userInfoRepository;
	public void addUser(UserInfoModel userModel){
		userInfoRepository.addUser(userModel);
	}
	
}
