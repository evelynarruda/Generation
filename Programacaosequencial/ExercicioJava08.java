package br.com.evelyn.hello;

import java.util.Scanner;

public class ExercicioJava08 {
	
        public static void main(String[] args) {		
		Scanner leia = new Scanner(System.in);
						
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("Entre com o custo de Fábrica:");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		double potencia	= Math.pow(custoConsumidor, 2);
		
		System.out.printf("Custo ao Consumidor: %.2f", custoConsumidor);
		System.out.println();
		System.out.println("Potência: " + potencia);
		
		leia.close();

	}

}

