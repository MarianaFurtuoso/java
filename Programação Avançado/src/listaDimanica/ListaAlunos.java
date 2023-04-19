package listaDimanica;

public class ListaAlunos {
	
	static final int QUANTIDADE_LISTA = 2; 
	
	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
	
	int tamanhoLista = 0;
	
	int tamanho() {
		return tamanhoLista;
	}
	
	Aluno obter(int indice) {
		return lista[indice];
	}
	
	void adicionar(Aluno aluno) {
		if (tamanhoLista ==lista.length) {
				Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
				
				for (int i = 0; i < lista.length; i++) {
						novaLista[i] = lista[i];
				}
				lista = novaLista;
		}
		lista[tamanhoLista] = aluno;
		
		tamanhoLista++;
	}
	
	void remover(Aluno aluno) {
		for (int i = 0; i < tamanhoLista; i++) {
			Aluno a = lista[i];
			
			if (a != null && a.equals(aluno)) {
				remover(i);
				break;
			} else if (a == null && aluno == null) {
				remover(i);
				break;
			}
		} 
	}
	void remover(int indice) {
		int indiceInicial = indice + 1;
		
		for (int i = indiceInicial; i < tamanhoLista; i++) {
			lista[i - 1] = lista[i];
			
		}
		
		tamanhoLista --;
		lista[tamanhoLista] = null;
	}
	
	void ordenar() {
			for (int i = 1; i < tamanhoLista; i++) {
					Aluno alunoPosicaoBase = lista[i];
					
					int indicePosicaoBase = i;
					
					while (indicePosicaoBase >0) {
						int indicePocisaoAnterior = indicePosicaoBase - 1; 
						Aluno alunoPosicaoAnterior = lista[indicePocisaoAnterior];
						
						Boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null  
										|| alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);
						
						if (alunoPosicaoAnteriorVemDepoisDe) {
								lista[indicePosicaoBase] = lista[indicePocisaoAnterior];
								
								indicePosicaoBase--;
						} else {
								break;
						}
						
						lista[indicePosicaoBase] = alunoPosicaoBase;
					}
			}
	}
	
	
}
