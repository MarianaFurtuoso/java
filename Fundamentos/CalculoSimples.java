import java.util.Scanner;

public class CalculoSimples {
		
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			int codigo = scanner.nextInt();
			int quantidade = scanner.nextInt();
			double valor = scanner.nextDouble();
			
			int codigo2 = scanner.nextInt();
			int quantidade2 = scanner.nextInt();
			double valor2 = scanner.nextDouble();
			
			double valorDacompra = (valor * quantidade) + (valor2 * quantidade2);
			System.out.printf("VALOR A PAGAR: R$ %.2f\n", (valorDacompra));

	}
	

}
