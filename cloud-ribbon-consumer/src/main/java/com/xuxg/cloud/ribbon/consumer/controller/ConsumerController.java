package com.xuxg.cloud.ribbon.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xuxg.cloud.ribbon.consumer.service.UserService;

@RestController
public class ConsumerController {
	@Autowired
	private UserService service;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return service.addService();
	}
}