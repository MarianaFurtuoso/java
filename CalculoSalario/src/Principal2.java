
public class Principal2 {

	public static void main(String[] args) {
			FolhaPagamento folha = new FolhaPagamento();
			double salario = folha.calcularSalario(160, 28,32.5,40.2);
			
			System.out.println("Salário calculado: " + salario);
	}

}
