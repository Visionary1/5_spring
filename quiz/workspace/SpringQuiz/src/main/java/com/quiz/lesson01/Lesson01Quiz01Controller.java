package com.quiz.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/quiz01")
@Controller
public class Lesson01Quiz01Controller {

	//	2. String 출력하기
	//	String return 을 통해서 아래와 같은 간단한 화면을 구성하세요.
	//	요청 URL : http://localhost:8080/lesson01/quiz01/1
	@RequestMapping("/1")
	@ResponseBody
	public String quiz01_1() {
		String text = "<h1>테스트 프로젝트 완성</h1> <h3>해당 프로젝트를 통해서 문제 풀이를 진행합니다</h3>";
		return text;
	}
	 
	//	3. Map JSON 출력
	//	Map 을 통해서 아래와 같은 형태의 json 데이터를 출력하세요.
	//	요청 URL : http://localhost:8080/lesson01/quiz01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Integer> quiz01_2() {
		
		Map<String, Integer> obj = new HashMap<>();
		obj.put("lang", 80);
		obj.put("math", 90);
		obj.put("eng", 85);
		
		return obj;
	}
}
