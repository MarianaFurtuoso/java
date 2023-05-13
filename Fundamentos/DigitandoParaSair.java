package fundamentos;

import java.util.Scanner;

public class DigitandoParaSair {

		public static void main(String[] args) {
			
			System.out.println("Digite algo ou sair para parar.");
			
			Scanner scanner = new Scanner(System.in);
			String s1 = scanner.nextLine();
			
			while(!s1.equalsIgnoreCase("sair")) {
				System.out.println("O que vc digitou: \""+ s1 + "\". Se quer parar digite sair. ");
				 s1 = scanner.nextLine();
			}
			
			scanner.close();
			
		}
}
