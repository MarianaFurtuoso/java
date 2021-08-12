
public class TesteJavaBean {
		
		public static void main(String[] args) {
			PessoaBean pessoa = new PessoaBean();
			pessoa.setNome("Mariana");
			pessoa.setIdade(22);
			
			
			System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
		}
}
