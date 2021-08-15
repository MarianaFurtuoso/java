package com.maricode.abstrata;

public class TesteClasseAbtrata {
	
		public static void main(String[] args) {
			Produto p = new ProdutoPerecivel();
			p.descricao = "Caixa de Leite";
			
			ProdutoPerecivel pp = (ProdutoPerecivel) p;
			pp.dataValidade = "10/08/2021";
			
			p.imprimirDescricao();
			
			
		}

}
