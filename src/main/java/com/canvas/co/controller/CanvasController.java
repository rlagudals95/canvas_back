package com.canvas.co.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CanvasController {
	
	@GetMapping("/")
	public String main() {
		return "<h1>canvas backend</h1>";
	}
	
	@PostMapping("/post")
	public Map<String, Object> post (){
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		result.put("status", "200");
		return result;
	}
	
	
}
