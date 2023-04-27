import java.util.Scanner;

public class OMaior {
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			int PrimeiraComparacao = (a + b + Math.abs(a-b))/2;
			int SegundaComparacao = (PrimeiraComparacao + c + Math.abs(PrimeiraComparacao - c))/2;
		
			
			System.out.println(SegundaComparacao + " eh o maior");
	}

}
