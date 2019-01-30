package com.example.flavio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flavio.dto.Pessoa;

@RestController
@RequestMapping("isAlive")
public class HomeController {

	@GetMapping("/ping")
	public Pessoa ping() {
		
		return new Pessoa("Flavio", 15);
	}
	
	
}
