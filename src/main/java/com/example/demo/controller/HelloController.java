package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")

public class HelloController {
	
	@GetMapping
	
public String hello () {
	return "hello world";
	
}

	@GetMapping ("/bsm")

	public String bsm () {
		
		return  "<b>Lista de BSM's <br />"
				+ "BSM-GM - Mentalidade de Crescimento <br />"
	     		+ "BSM-P- Persistência<br />"
				+ "BSM-PR - Responsabilidade Pessoal<br />"
				+ "BSM-FO - Orientação ao Futuro<br />"
				+ "BSM-C - Comunicação<br />"
				+ "BSM-OD - Orientação ao Detalhe<br />"
				+ "BSM-PA - Proatividade<br />"
				+ "BSM-T- Trabalho em Equipe";
		}

@GetMapping ("/objetivos")

public String objetivos () {
	
	return "<b> Meus Objetivos <br />"
		   + "Proatividade <br />"
		   + "Trabalho em Equipe <br />";
 			
}

}



		