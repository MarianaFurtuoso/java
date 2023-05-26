package fundamentos;

import java.util.Scanner;

public class ExerciciosEstruturaDeControle3 {
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite a primeira nota: ");
			double nota1 = scanner.nextDouble();
			System.out.println("Digite a segunda nota: ");
			double nota2 = scanner.nextDouble();
			
			double media = (nota1+nota2)/2;
			
			if(media >= 7) {
				System.out.println("Vc foi aprovado!");
			} else if (media < 7 || media >= 4) {
				System.out.println("Vc está de recuperação.");
			} else {
				System.out.println("Vc foi reprovado.");
			}
			
			scanner.close();
			
			
			
	}

}
