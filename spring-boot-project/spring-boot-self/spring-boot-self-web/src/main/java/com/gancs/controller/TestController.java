package com.gancs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gancs
 * @description
 * @date 2020/7/27
 */
@RestController
@RequestMapping("/test")
public class TestController {

	public TestController(){
		System.out.println("TestController 被初始化...");
	}

	@GetMapping("/strTest")
	public void strTest(){
		System.out.println("...");
	}

}
