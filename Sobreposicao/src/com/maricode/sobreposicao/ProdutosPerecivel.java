package com.maricode.sobreposicao;

import java.util.Date;

public class ProdutosPerecivel extends Produto {
	
		protected Date dataValidade;
		
		public void identificar() {
				super.identificar();
				System.out.println("Minha data de validade é: " + dataValidade);
		}
		
}
