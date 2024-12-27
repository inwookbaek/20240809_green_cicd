package com.lec.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/list")
	public String list() {
<<<<<<< HEAD
		return "<h1 align=\"center\">최종테스트 10 - Board List....</h1>";
=======
		return "<h1 align=\"center\">최종테스트 9 - Board List....</h1>";
>>>>>>> a832bfe8e46f804f3bfcbcea750821767421a331
	}
	
	@GetMapping("/getBoard")
	public String getBoard() {
		return "<h1>Get Board ....</h1>";
	}
}
