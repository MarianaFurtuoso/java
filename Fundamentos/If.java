package fundamentos;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Infome a média: ");
		double media = scanner.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabens");
		}
		
		
		
		scanner.close();
				
	}

}
