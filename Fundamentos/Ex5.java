package fundamentos;

import java.util.Scanner;

public class Ex5 {
	
		public static void main(String[] args) {
			
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
					contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		case 2:
			System.out.println("primo");
			break;
			
		default:
			System.out.println("nao é primo");
		}
			}

}
