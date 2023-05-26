package fundamentos;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numAleatorio = random.nextInt(101);
		
		int contadorDeTentativa = 9;
		Scanner scanner = new Scanner(System.in);
		System.out.println(numAleatorio);
		System.out.println("Digite o numero para tentar adivinhar!");
		int num = scanner.nextInt();
		
		for(int i = 1; i < 11; i++) {
			if(numAleatorio != num && num < numAleatorio) {
				contadorDeTentativa --;
				System.out.println("Errou!! Esse n° é menor. Vc tem só mais " + (contadorDeTentativa + 1) + " chances. Tente de novo:");
				num = scanner.nextInt();
			} else if(numAleatorio != num && num > numAleatorio) {
					contadorDeTentativa --;
					System.out.println("Errou!! Esse n° é maior. Vc tem só mais " + (contadorDeTentativa + 1) + " chances. Tente de novo:");
					num = scanner.nextInt();
			} else {
				System.out.println("Vc acertou o numero que é " + numAleatorio);
				break;
			}
		}
		
	}

}
