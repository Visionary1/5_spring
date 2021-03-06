package com.quiz.lesson01;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController
public class Lesson01Quiz02Controller {

	//	1. json 출력 (List, Map)
	//	영화 정보를 저장한 json을 List와 Map을 활용해서 아래와 같이 출력하세요.
	//	요청 URL : http://localhost:8080/lesson01/quiz02/1
	@RequestMapping("/1")
	public List<Map <String, Object>> quiz02_1() {
		
		List<Map<String, Object>> output = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> films = new HashMap<>();
		films.put("rate", "15");
		films.put("director", "봉준호");
		films.put("time", "131");
		films.put("title", "기생충");
		output.add(films);
		
		// 왜 films.clear(); 는 안될까
		films = new HashMap<>();
		films.put("rate", "0");
		films.put("director", "로베르토 베니니");
		films.put("time", "116");
		films.put("title", "인생은 아름다워");
		output.add(films);
		
		films = new HashMap<>();
		films.put("rate", "12");
		films.put("director", "크리스토퍼 놀란");
		films.put("time", "147");
		films.put("title", "인셉션");
		output.add(films);
		
		films = new HashMap<>();
		films.put("rate", "19");
		films.put("director", "윤종빈");
		films.put("time", "133");
		films.put("title", "범죄와의 전쟁");
		output.add(films);
		
		films = new HashMap<>();
		films.put("rate", "15");
		films.put("director", "프란시스 로렌스");
		films.put("time", "137");
		films.put("title", "헝거게임");
		output.add(films);
		
		return output;
	}
	
	//	2. json 출력 (List, Class)
	//	게시판 내용을 저장한 json을 List 와 Class 를 설계하고 활용해서 아래와 같이 출력하세요.
	//	요청 URL : http://localhost:8080/lesson01/quiz02/2
	@RequestMapping("/2")
	public List<Object> quiz02_2() {
		
		List<Object> output = new ArrayList<>();
		
		Lesson01Quiz02_2 board = new Lesson01Quiz02_2();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요, 가입했어요, 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다");
		output.add(board);
		
		board = new Lesson01Quiz02_2();
		board.setTitle("헐 대박");
		board.setUser("bada");
		board.setContent("오늘 목요일이 있어... 금요인줄");
		output.add(board);
		
		board = new Lesson01Quiz02_2();
		board.setTitle("오늘 데이트 한 이야기 해드릴게요");
		board.setUser("dulumary");
		board.setContent("...");
		output.add(board);
		
		return output;
	}
	
	//	3. ResponseEntity
	//	아래와 같이 게시글 내용을 하나만 json 으로 출력하세요.
	//	ResponseEntity 를 이용해서 HttpStatus.INTERNAL_SERVER_ERROR 로 상태 코드를 전달하세요
	@RequestMapping("/3")
	public ResponseEntity<Object> quiz02_3() {
		
		// 게시판
		Lesson01Quiz02_2 board = new Lesson01Quiz02_2();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요, 가입했어요, 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다");
		
		return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
