import java.util.Scanner;

public class PagamentoIpva {

      public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite o final da placa: ");
			int finalPlaca = entrada.nextInt();
			
			switch (finalPlaca) {
					case 1,2,5,6:
					System.out.println("Vencimento dia 11 de Janeiro");
					break;
					
					case 3,4,7,8:
					System.out.println("Vencimento dia 12 de Janeiro");
					break;
					
					default:
							System.out.println("Vendimento sem data, tente outro dia");
					
					
			    }
			}
	  
	  
	  }