package br.com.edu.marina.atividade.impl;

import br.com.edu.marina.atividade.Atividade;
import br.com.edu.marina.model.Pessoa;

public class Caminhada implements Atividade {

	public void executar(Pessoa pessoa) {
		System.out.println(
				"Eu \"" + pessoa.getNome() + "\"" + " estou andando com o \"" + pessoa.getCachorro().getNome() + "\"");
	}

	public void andar(Pessoa pessoa) {
		this.executar(pessoa);
	}

}
