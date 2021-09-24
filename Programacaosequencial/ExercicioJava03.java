package br.com.evelyn.hello;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/


    public class ExercicioJava03 {
    	public static void main(String[] args) {
    		
    		Scanner leia=new Scanner(System.in);

    		int horas, minutos, segundos; 
    		
    		System.out.println("Digite a duração do evento em segundos: ");
    		segundos = leia.nextInt();
    		
    		horas = segundos / 3600;
    		minutos = (segundos % 3600) / 60;
    		segundos = (segundos % 3600) % 60;
    		
    		System.out.println("\nO evento teve " 
    				            + "\nHoras: " + horas + "hrs"
    				            		+ "\nMinutos: " + minutos + "mins"
    				            		+ "\nSegundos: " + segundos + "segs");
    		
    		leia.close();
    		
    	}
	

}
