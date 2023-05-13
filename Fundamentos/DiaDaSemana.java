package fundamentos;

import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite dia da semana");
		String dia = scanner.next();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if(dia.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		} else if(dia.equalsIgnoreCase("Terça")
				|| dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		} else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		} else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		} else if(dia.equalsIgnoreCase("Sábado")
				|| dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido");
		}
		
			
	}

}
