package com.aulapablo.p5spring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(value= "avaliacao")
public class Avaliacaoresource {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
	return "Avaliaçao terminada, professor chimpa!";
	}
}