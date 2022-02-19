package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Quiz03Controller {
	
	@RequestMapping("/lesson01/quiz03")
	public String quiz03() {
		// ResponseBody 가 엄서서 /WEB-INF/jsp/ ViewResolver 로 넘어감
		return "lesson01/quiz03";
	}
	
}
