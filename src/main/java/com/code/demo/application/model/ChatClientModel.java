package com.code.demo.application.model;

public class ChatClientModel {

    private MessageType type;
    private String content;
    private String name;
    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
	

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ChatClientModel() {
	}

	public ChatClientModel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
