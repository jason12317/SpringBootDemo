package com.code.demo.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.code.demo.application.model.UserInfoModel;
import com.code.demo.application.model.UserInfoPersistence;
import com.code.demo.application.repository.UserInfoRepository;

import java.util.List;

import javax.servlet.http.HttpSession;

@Controller
public class UserInfoController {

    @Autowired
    UserInfoRepository userInfoRepository;

    @GetMapping("/login")
    public String login(Model model) {
    	UserInfoPersistence userInfoPersistence = new UserInfoPersistence(); // 將Person 實體化
        model.addAttribute("userInfoPersistence", userInfoPersistence);
        return "login";
    }
    
    @GetMapping("/signup")
    public String signup(Model model) {
    	UserInfoPersistence userInfoPersistence = new UserInfoPersistence(); // 將Person 實體化
        model.addAttribute("userInfoPersistence", userInfoPersistence);
        return "signup";
    }
    
    @PostMapping("/doLogin")
    public String doLogin(@ModelAttribute UserInfoPersistence userInfoPersistence,HttpSession session, Model model) {
        System.out.println("ininder");

		String email = userInfoPersistence.getEmail();
		String password = userInfoPersistence.getPassword();
        
        List<UserInfoPersistence> userInfoList = userInfoRepository.findCheckMemberAccount(email, password);
        UserInfoModel userAccount = new  UserInfoModel();
        userAccount.setPassword(password);
        userAccount.setEmail(email);

		if (userInfoList.size() == 0) {
			model.addAttribute("message","帳號或密碼錯誤,請重新登入!!");
			return "login";
		} else {
			session.setAttribute("uid", userAccount);
			return "welcome";
		}
    }
    
    @GetMapping("/admin")
    public String memberListPage(Model model){
    	List<UserInfoPersistence> userInfoList = userInfoRepository.findAll();
		model.addAttribute("userInfoList", userInfoList);
        return "admin";
    }   


}
