package br.com.evelyn.hello;

import java.util.Scanner;
import java.lang.Math;

public class ExercicioJava04 {
	
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);

		
		int a, b;
		double c, d, r, s;
		
		System.out.print("Digite o valor de A: ");
		  a = leia.nextInt();
		  
		  System.out.print("Digite o valor de B: ");
		  b = leia.nextInt();
		  
		  System.out.print("Digite o valor de C: ");
		  c = leia.nextInt();
		  
		  c = Math.sqrt(c);
		  
		 
		  r = Math.pow((a+b), 2.0);
		  s = Math.pow((a+b), 2.0);
		  
		  d = (r+s) / 2;
		  
		 
		  
		  System.out.println("\nO valor de R é: " + r);
		  System.out.println("\nO valor de S é: " + s);
		  System.out.println("\nO valor de D é: " + d);
		  
		  leia.close();
		  
		  
		
	}

}
