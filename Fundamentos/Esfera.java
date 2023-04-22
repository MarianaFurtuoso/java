import java.util.Scanner;

public class Esfera {
	
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				float raio = scanner.nextFloat();
				
				double pi = 3.14159;
				
				double volumeDaEsfera = (4/3.0)* pi * (Math.pow(raio, 3));
				
				System.out.printf("VOLUME = %.3f\n", volumeDaEsfera);
				
		}

}
