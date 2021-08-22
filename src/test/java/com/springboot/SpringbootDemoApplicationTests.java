package com.springboot;

//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.code.demo.application.SpringbootDemoApplication;
//import com.code.demo.application.model.UserInfoPersistence;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//
//@SpringBootTest
//@AutoConfigureMockMvc
//class SpringbootDemoApplicationTests {
//
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//    ObjectMapper objectMapper;
//    @MockBean
//    UserInfoPersistence userInfo;
//
//	@Before
//	public void setup(){
//		UserInfoPersistence userInfo = new UserInfoPersistence();
//		userInfo.setId(1);
//		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//	}
//	
//	@Test
//	void contextLoads() throws Exception {
//		String uri = "/userApi/1";
//		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON)).andReturn();
//		int status = result.getResponse().getStatus();
//		System.out.println(status);
//		Assert.assertEquals("錯誤",200,status);
//	}
//
//}
