package com.code.demo.application.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.code.demo.application.model.UserInfoModel;
import com.code.demo.application.service.UserInfoService;
import com.code.demo.application.model.UserInfoPersistence;
import com.code.demo.application.repository.UserInfoRepository;

@RestController
@RequestMapping("/userApi")
public class RestUserApiController {

	@Autowired
	UserInfoModel userModel;
	@Autowired
	UserInfoService userService;
	@Autowired
	UserInfoRepository userInfoRepository;

	@GetMapping("/addUser")
	public String addUser() {
		userModel = new UserInfoModel();
		userModel.setPassword("333");
		userModel.setEmail("3email@email.com");
		userModel.setAcctDesc("787878");
		userModel.setAddress("Taiwan");
		userModel.setPic("p2");
		userService.addUser(userModel);
		return "New Staff added";
	}

	@RequestMapping(value = "/{id}")
	public Optional<UserInfoPersistence> read(@PathVariable long id) {
		return userInfoRepository.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	 public void create(@RequestBody UserInfoPersistence userInfoPresistence) {
		userInfoRepository.save(userInfoPresistence);
	 }
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	 public void update(@RequestBody UserInfoPersistence userInfoPresistence) {
		userInfoRepository.save(userInfoPresistence);
		
	 }	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	 public void delete(@PathVariable long id) {
		userInfoRepository.deleteById(id); 
		 
	 }	

	@GetMapping("/queryUser")
	public List<UserInfoPersistence> queryUser() {
		List<UserInfoPersistence> userInfoPresistence = new ArrayList<UserInfoPersistence>();

		for (int i = 0; i < userInfoPresistence.size(); i++) {
			System.out.println(userInfoPresistence.get(i).getId());
		}
		return userInfoPresistence;
	}

}
