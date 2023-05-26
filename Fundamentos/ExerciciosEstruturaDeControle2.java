package fundamentos;

import java.util.Scanner;

public class ExerciciosEstruturaDeControle2 {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o ano para verificar se é bissexto.");
			int ano = scanner.nextInt();
			
				if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 00) {
					System.out.printf("Ano %d é bissexto!", ano) ;
				} else {
					System.out.printf("O ano %d não é bissexto.", ano);
				}
				
			
			
			scanner.close();
			
		
		}
}
