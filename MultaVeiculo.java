import java.util.Scanner;

public class MultaVeiculo {

       public static void main(String[] args ) {
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Qual tipo de veiculo (passeio,caminhao)");
				String tipoVeiculo = entrada.nextLine();
				
				System.out.println("Qual Velocidade Maxima?");
				int velocidadeMax = entrada.nextInt(); 
				
				System.out.println("Velocidade do veiculo?");
				int velocidadeVeiculo = entrada.nextInt();
				
				if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMax * 1.1)
							||(tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMax * 1.05)) {
							System.out.println("Multa");}

		}
}
