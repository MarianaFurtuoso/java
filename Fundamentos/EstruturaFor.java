import java.util.Scanner;

public class EstruturaFor {

		public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero final: ");
		int numeroFinal = entrada.nextInt();
		
		for (int i= 0; i <= numeroFinal; i++) {
				System.out.println(i);
		}
		
		
		}
		

}