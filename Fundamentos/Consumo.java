import java.util.Scanner;

public class Consumo {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			double X = scanner.nextDouble();
			double Y = scanner.nextDouble();
			
			double valor = X/Y;
			
			System.out.printf("%.3f km/l\n", valor);
		}

}
