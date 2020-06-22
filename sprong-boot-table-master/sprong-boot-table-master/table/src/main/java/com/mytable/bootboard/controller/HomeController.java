package com.mytable.bootboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mytable.bootboard.service.BoardService;
import com.mytable.bootboard.vo.Board;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("boardService")
	BoardService boardService;
	
	@GetMapping(path = { "/", "/home" })
	public String home() {	
		
		return "home";		
	}
	
	@GetMapping(path = { "/list" })
	public String showList(Model model) {
		List<Board> board = boardService.showList();
		
		if (board == null) {
		
		return "list";	
		
		} else {
			
		model.addAttribute("boards",board);
		return "list";	
		
		}
			
	}
	
	@GetMapping(path = { "/write" })
	public String showWrite() {		
		
		return "write";		
	}
	
	@PostMapping(path = { "/write" })
	public String doWrite(Board board) {		
		//boardService.doWrite(board);
		
		return "redirect:list";		
	}
	
	@GetMapping(path = { "/detail" })
	public String showDetail() {
		
		return "redirect:list";
	}	
	
}