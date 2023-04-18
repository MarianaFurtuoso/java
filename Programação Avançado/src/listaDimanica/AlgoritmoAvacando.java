package listaDimanica;

public class AlgoritmoAvacando {
	
		public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Laura";
		lista.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Lia";
		lista.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Valentina";
		lista.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Mariana";
		lista.adicionar(aluno4);
		
		for (int i = 0; i < lista.tamanho(); i++) {
				Aluno a = lista.obter(i);
				if (a != null) {
						System.out.println("Aluno: " + a.nome);
				} else {
						System.out.println("Aluno sem nome");

				}
		}
		System.out.println("-----------------");
		
		lista.remover(aluno1);
		
		for (int i = 0; i < lista.tamanho(); i++) {
			Aluno a = lista.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);
		} else {
				System.out.println("Aluno sem nome");
				}
			}
		}

}
