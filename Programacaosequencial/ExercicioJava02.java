package br.com.evelyn.hello;

import java.util.Scanner;

/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/

public class ExercicioJava02 {
	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		
		int diasMes, diasAno;
		int anos, meses, dias;
		
		System.out.println("Digite a sua idade em dias: ");
		dias = leia.nextInt();
		
		diasMes = 30;
		diasAno = 365;
		
		
		anos = diasAno / 365;
		meses = (diasMes % 365) / 30;
		dias = (dias % 365) /30;
		
		
		System.out.println("\n Sua idade em anos é igual a: " + anos + " anos" );
		System.out.println("\n Sua idade em meses é igual a: " + meses + " meses");
		System.out.println("\n Sua idade em anos é igual a: " + dias + " dias");
		
		leia.close();
		
		
	
		
		
		
		
		
		
				
		
	}
	

}
