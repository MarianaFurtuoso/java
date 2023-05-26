package fundamentos;

import java.util.Scanner;

public class ExerciciosEstruturaDeControle4 {

	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nº para verificar se ele é número primo.");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
					contadorDeDivisores++;
			}

		}
		
		if (contadorDeDivisores == 2) {
				System.out.println("é primo");
		} else {
				System.out.println("não é primo");
			
		}

	}

}
