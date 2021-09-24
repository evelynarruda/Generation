package br.com.generation.generation.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("MinhaPrimeiraAplicacao")

public class PrimeiraAplication {
	
	@GetMapping
	public static void main(String[] args) {
		SpringApplication.run(PrimeiraAplication.class, args);
		System.out.println("Persistência");
		System.out.println("Responsabilidade Pessoal");
		System.out.println("Atenção aos detalhes");
		System.out.println("Proatividade");

}
}