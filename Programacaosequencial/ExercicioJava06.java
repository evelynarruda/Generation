package br.com.evelyn.hello;

import java.util.Scanner;

public class ExercicioJava06 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);

		double x1, x2, y1, y2, totalX, totalY, somaP, potX, potY, D;
		
		System.out.println("Entre com o valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Entre com o valor de y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Entre com o valor de x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Entre com o valor de y2: ");
		y2 = leia.nextDouble();
		
		totalX = x2 - x1;
		totalY = y2 - y1;
		potX = Math.pow(totalX, 2.0);
		potY = Math.pow(totalY, 2.0);
				
		
		somaP = potX + potY;
		D = Math.sqrt(somaP);
		
		System.out.println("\nA distância é de: " + D);
		
		leia.close();
		


	}

}
