package com.maricode.sobreposicao;

import java.util.Date;

public class Teste {
	
	public static void main(String[] args) {
			ProdutosPerecivel pp = new ProdutosPerecivel();
			pp.descricao =  "Caixa de Fosforo";
			pp.dataValidade = new Date();
			pp.identificar();
	}
	

}
