package br.com.edu.marina.aplicacao;

import java.util.Arrays;
import java.util.List;

import br.com.edu.marina.atividade.Atividade;
import br.com.edu.marina.atividade.impl.Caminhada;
import br.com.edu.marina.atividade.impl.Corrida;
import br.com.edu.marina.atividade.impl.Futebol;
import br.com.edu.marina.model.Cachorro;
import br.com.edu.marina.model.Pessoa;

public class Passeio {

	public static void main(String[] args) {
		executarCaminhada();
		executarCaminhadaEvolucao();
	}

	private static void executarCaminhada() {
		Pessoa p1 = new Pessoa();
		p1.setNome("José");

		p1.setCachorro(new Cachorro());

		p1.getCachorro().setNome("Bidu");
		p1.getCachorro().setIdade(3);
		p1.getCachorro().setRaca("Boxer");
		p1.getCachorro().setSexo('M');

		Caminhada c = new Caminhada();

		c.andar(p1);
	}

	private static void executarCaminhadaEvolucao() {
		Pessoa p1 = new Pessoa("José");

		Cachorro c1 = new Cachorro("Bidu", "Boxer", 'M', 3);

		p1.setCachorro(c1);

		Atividade a1 = new Caminhada();
		Atividade a2 = new Corrida();
		Atividade a3 = new Futebol();
		
		List<Atividade> listaAtividades = Arrays.asList(a1,a2,a3);
		
		listaAtividades.forEach(atividade -> atividade.executar(p1));
	}
}
