package com.java265.helloworld.Controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	
	/**
	 * java265.com
	 * �˴��Ǳ��ߵ�
	 * ��һ��Spring MVC��Ŀ
	 * ���� ����hello.jspҳ������չʾһ��hello��ҳ��
	 * @return
	 */
	
	@RequestMapping("/hello")
	public String HelloWorld() {
		
		return "hello"; 
	}
}
