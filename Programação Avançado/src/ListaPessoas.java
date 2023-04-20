
public class ListaPessoas {
	
	static final int QUANTIDADE_LISTA = 10;
	
	Pessoa [] lista = new Pessoa[QUANTIDADE_LISTA];
	
	int tamanhoLista = 0;
	
	Pessoa obter(int indice) {
		return lista[indice]; 
		
	}
	
	int tamanho() {
		return tamanhoLista;
	}
	
	void adicionar(Pessoa pessoa) {
		if (tamanhoLista == lista.length) {
				Pessoa[] novaLista = new Pessoa[QUANTIDADE_LISTA + lista.length];
				
				for (int i = 0; i < lista.length; i++) {
						novaLista[i] = lista[i];
				}
				lista = novaLista;
		}
		lista[tamanhoLista] = pessoa;
		
		tamanhoLista++;
	}
	
	void ordenacao() {
				for (int i = 1; i < tamanhoLista; i++) {
			
			Pessoa pessoaPosicaoBase = lista[i];
			
			int indicePosicaoBase = i;
			
			while (indicePosicaoBase > 0) {
					int indicePosicaoAnterior = indicePosicaoBase - 1;
					Pessoa pessoaPosicaoAnterior = lista[indicePosicaoAnterior];
					
					Boolean pessoaPosicaAnteriorVemDepoisDe = pessoaPosicaoAnterior == null
								|| pessoaPosicaoAnterior.vemDepoisDe(pessoaPosicaoBase);
					
					if (pessoaPosicaAnteriorVemDepoisDe) {
							lista[indicePosicaoBase] = lista[indicePosicaoAnterior]; 
							
							indicePosicaoBase--;
					} else {
							break;
					}
			}
			lista[indicePosicaoBase] = pessoaPosicaoBase;
		}
		
	}

}
