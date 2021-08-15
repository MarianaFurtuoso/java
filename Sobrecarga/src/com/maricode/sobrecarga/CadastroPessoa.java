package com.maricode.sobrecarga;

public class CadastroPessoa {

	   public void cadastrar(Pessoa pessoa) {
		   armazenar(pessoa.getNome(), pessoa.getIdade());
	   }
	   
	   public void cadastrar(String nome, int idade) {
		   	armazenar(nome, idade);
	   }
	   
	   public void armazenar(String nome, int idade) {
		   //salva no BD....
		   System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos. ");
	   }
}
