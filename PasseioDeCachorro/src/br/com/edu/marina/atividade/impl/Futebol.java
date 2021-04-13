package br.com.edu.marina.atividade.impl;

import br.com.edu.marina.atividade.Atividade;
import br.com.edu.marina.model.Pessoa;

public class Futebol implements Atividade {

	public void executar(Pessoa pessoa) {
		System.out.println("Eu \"" + pessoa.getNome() + "\"" + " estou jogando futebol com o \""
				+ pessoa.getCachorro().getNome() + "\"");
	}

}
