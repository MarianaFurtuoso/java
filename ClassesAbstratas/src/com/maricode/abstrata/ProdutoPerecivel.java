package com.maricode.abstrata;

public class ProdutoPerecivel extends Produto {
	
	String dataValidade;
	
	public void imprimirDescricao()  {
		System.out.println("Descri��o: " + super.getDescricao() + " . Vencendo em: " + dataValidade);
	}

}
