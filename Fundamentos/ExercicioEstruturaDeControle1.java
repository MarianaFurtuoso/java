package fundamentos;

import java.util.Scanner;

public class ExercicioEstruturaDeControle1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		while (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				System.out.printf("O n° %d é par\n", num);
				break;
			} else {
				System.out.printf("O n° %d é impar\n", num);
				break;
			}
		}

		scanner.close();
	}

}
