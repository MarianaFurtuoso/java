import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double pi = 3.14159;
		
		
		System.out.printf("TRIANGULO: %.3f\n", (a * c)/2);
		System.out.printf("CIRCULO: %.3f\n", pi * (Math.pow(c, 2)) );
		System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
		System.out.printf("QUADRADO: %.3f\n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.3f\n", a * b);
	}

}
