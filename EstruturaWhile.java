import java.util.Scanner;

public class EstruturaWhile {

		public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero inicial: ");
		int numInicial = entrada.nextInt();
		
		System.out.print("Digite um numero final: ");
		int numFinal = entrada.nextInt();
		
		int numAtual = numInicial;
		
		while (numAtual <= numFinal) {
				System.out.println(numAtual);
				numAtual++;
		
		}
		
		
		
		}

}