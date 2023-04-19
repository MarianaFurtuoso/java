package listaDimanica;

public class AlgoritmoAvacando {
	
		public static void main(String[] args) {
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Laura";
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Lia";
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Valentina";
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Mariana";
		listaAlunos.adicionar(aluno4);
		

		iterar(listaAlunos);
		
		listaAlunos.ordenar();
		
		iterar(listaAlunos);
		
		listaAlunos.remover(aluno1);
		
		iterar(listaAlunos);
		
		
		
		}
		
		static void iterar(ListaAlunos listaAlunos) {
				for (int i = 0; i < listaAlunos.tamanho(); i++) {
						Aluno a = listaAlunos.obter(i);
						if (a != null) {
								System.out.println("Aluno: " + a.nome);
						} else {
								System.out.println("Aluno sem nome");
						}
				}
				
				System.out.println("-------------------------------------------");
		}

		
}
