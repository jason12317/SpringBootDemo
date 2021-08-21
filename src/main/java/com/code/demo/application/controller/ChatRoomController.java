package com.code.demo.application.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.code.demo.application.model.ChatClientModel;
import com.code.demo.application.model.ChatServerResponseModel;

@Controller
public class ChatRoomController {
	@MessageMapping("/messageControl")
	@SendTo("topic/getResponse")
	public ChatServerResponseModel said(ChatClientModel responseMessage) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("msg=" + responseMessage.getName());
		return new ChatServerResponseModel("歡迎來到," + responseMessage.getName());
	}
}
