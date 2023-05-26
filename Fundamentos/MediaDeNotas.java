package fundamentos;

import java.util.Scanner;

public class MediaDeNotas {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
		
			double nota = 0;
			int quantidadeDeNotas = 0;
			double total = 0;

			
			while(nota != -1) {
				System.out.println("Informe a nota (ou -1 p; sair): ");
				nota = scanner.nextDouble();
				
				if(nota <= 10 && nota >= 0) {
					total +=nota;
					quantidadeDeNotas++;
				} else if(nota != -1) {
					System.out.println("Nota inválida!");
				}
			}
			
			double media = total / quantidadeDeNotas;
			System.out.println("Média = " + media);
			
			scanner.close();
		}

}
