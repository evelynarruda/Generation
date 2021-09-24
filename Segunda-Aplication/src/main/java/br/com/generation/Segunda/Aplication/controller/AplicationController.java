package br.com.generation.Segunda.Aplication.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("MinhaSegundaAplicacao")

public class AplicationController {
	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(AplicationController.class, args);
		System.out.println("Objetivos de aprendizagem da semana: "
				+ "\n Ter atenção aos detalhes, persistência e proatividade para mexer nos IDE's com confiança");

}
}
