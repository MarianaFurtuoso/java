import java.util.Scanner;

public class ClassificacaoEtaria {

		public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);           
		
		System.out.println("Qual sua idade? ");
		int idade = entrada.nextInt();
		
		String classificacao = (idade >= 18) ? "adulto" : "crianca/adolescente";
		System.out.print("Sua classificacao de idade:  " + classificacao);
		
		
		}

}