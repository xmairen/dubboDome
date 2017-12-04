package com.consumer.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.HelloService;

public class ConsumerClient {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        String result = helloService.speakHello("chen");
        System.out.println(result);
    }
}
