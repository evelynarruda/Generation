package br.com.evelyn.hello;

import java.util.Scanner;

/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/


public class ExercicioJava05 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		double nota1, nota2, nota3, peso1, peso2, peso3, mediaPonderada;
		
		System.out.println("Entre com o valor da nota 1: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Entre com o valor da nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Entre com o valor da nota 3: ");
		nota3 = leia.nextDouble();
		
				
		peso1 = 2.0;
		peso2 = 3.0;
		peso3 = 5.0;
		
		mediaPonderada = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1+peso2+peso3);
		
		System.out.print("O resultado da m�dia do aluno �: " + mediaPonderada);
		
		leia.close();
		
		
		

	}

}
