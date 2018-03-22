package com.aulapabloramon.av001.resoucrces;

public class Avaliacaoresource {
	
	@restcontroller 
	@requestmapping(value= "avaliacao")
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
	return "Avaliaçao terminada, professor chimpa!";
}
