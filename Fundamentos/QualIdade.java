import java.util.Scanner;

public class QualIdade {
			
			public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Qual a sua idade? ");
			int idade = entrada.nextInt();
			
			int anoPassado = --idade;
			int anoQueVem = idade + 2;
			
			System.out.print("Sua idade ano passado foi " + anoPassado + " e ano que vem sera " + anoQueVem + " !!");
			
			
			}


