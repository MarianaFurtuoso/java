
public class Pessoa {

		String nome;
		
		boolean vemDepoisDe(Pessoa pessoa) {
				if (pessoa == null) {
						return false;
				}
				return nome.compareTo(pessoa.nome) > 0;
}

}