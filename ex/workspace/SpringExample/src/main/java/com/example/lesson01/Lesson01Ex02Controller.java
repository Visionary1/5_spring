package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Lesson01Ex02Controller {
	
	// request URL : http://localhost:8080/lesson01/ex02/1
	// @RequestMapping("/lesson01/ex02/1")
	public String ex01_1() {
		
		// ResponseBody 가 아닌 상태로 string 을 리턴하면
		// ViewResolver 에 의해서 리턴된 string 이름의 view를 찾고 view 화면이 구성된다
		
		// WEB-INF/jsp/    lesson01/ex02  .jsp
		return  "lesson01/ex02";
	}
}
