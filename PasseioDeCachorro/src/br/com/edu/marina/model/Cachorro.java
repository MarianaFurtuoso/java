package br.com.edu.marina.model;
/**
 * @see Pessoa
 * @author arnaldoidao
 *
 */
public class Cachorro {

	private String nome;
	private String raca;
	private char sexo;
	private int idade;

	public Cachorro() {
		super();
	}

	public Cachorro(String nome, String raca, char sexo, int idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
