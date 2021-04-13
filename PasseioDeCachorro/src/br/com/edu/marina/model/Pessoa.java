package br.com.edu.marina.model;
/**
 * Padrao java beans define que sempre tenhamos as propriedades como privadas 
 * e definamos getters para as quais quisermos acessar
 * sempre interessante criar construtores com os possiveis argumentos
 * assim facilita na hora de criar uma nova instancia
 * @author arnaldoidao
 *
 */
public class Pessoa {

	private String nome;
	private Cachorro cachorro;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	public Pessoa(String nome, Cachorro cachorro) {
		super();
		this.nome = nome;
		this.cachorro = cachorro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cachorro getCachorro() {
		return cachorro;
	}

	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}

}
