package com.java265.helloworld.Controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	
	/**
	 * java265.com
	 * 此处是笔者的
	 * 第一个Spring MVC项目
	 * 她将 调用hello.jsp页面给大家展示一个hello的页面
	 * @return
	 */
	
	@RequestMapping("/hello")
	public String HelloWorld() {
		
		return "hello"; 
	}
}
