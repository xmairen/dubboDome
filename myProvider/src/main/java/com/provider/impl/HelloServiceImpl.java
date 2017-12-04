package com.provider.impl;

import com.service.HelloService;

public class HelloServiceImpl implements HelloService{
	
	 public String speakHello(String name) {
	        return "你好:"+name+"欢迎";
	    }
}
