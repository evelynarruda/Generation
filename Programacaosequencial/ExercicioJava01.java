package br.com.evelyn.hello;

import java.util.Scanner; 

/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/ 


public class ExercicioJava01 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		
		int idadeDias, meses, anos;
		System.out.println("Digite a sua idade em anos, meses e dias: ");
		System.out.println("Anos: ");
		anos = leia.nextInt();
		
		System.out.println("Meses: ");
		meses = leia.nextInt();
		
		System.out.println("Dias: ");
		idadeDias = leia.nextInt();
		
		idadeDias = (anos*365)+(meses*30)+idadeDias;
		System.out.print("A sua idade em dias é igual a: " +idadeDias + " dias");
		
		leia.close();
	}
}
