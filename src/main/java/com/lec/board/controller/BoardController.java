package com.lec.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/list")
	public String list() {
		return "<h1 align=\"center\" style="color: 'red'">최종테스트 Last!!!!! - Board List....</h1>";
	}
	
	@GetMapping("/getBoard")
	public String getBoard() {
		return "<h1>Get Board ....</h1>";
	}
}
