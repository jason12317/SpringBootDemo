package com.code.demo.application.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.HtmlUtils;

import com.code.demo.application.model.ChatResponseModel;
import com.code.demo.application.model.ChatClientModel;


@Controller
public class WebSocketController {

	@GetMapping("/chat")
	public String chat(Model model) {
		return "chat";
	}
	
	@MessageMapping("/messageControl")
	@SendTo("/topic/chatRoom")
	public ChatResponseModel said(ChatClientModel message) throws Exception {
		Thread.sleep(1000); // simulated delay
		return new ChatResponseModel(HtmlUtils.htmlEscape(message.getName()) + ":" + HtmlUtils.htmlEscape(message.getContent()));
	}

}
