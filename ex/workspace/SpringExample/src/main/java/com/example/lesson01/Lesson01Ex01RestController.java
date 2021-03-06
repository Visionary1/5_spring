package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/lesson01/ex01")
@RestController // @Controller + @ResponseBody
public class Lesson01Ex01RestController {
	
	// request URL : http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "reutrn str via @RestController";
	}
	
	// request URL : http://localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map<String, String> map = new HashMap<>();
		
		map.put("aa", "111");
		map.put("bb", "222");
		map.put("cc", "333");
		
		return map;
	}
	
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data(); // java bean obj
		
		data.setId(3);
		data.setName("test");
		
		return data; // output in json format
	}
	
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data();
		
		data.setId(23);
		data.setName("신바다");
		
//		return new ResponseEntity<>(data, HttpStatus.OK);
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
