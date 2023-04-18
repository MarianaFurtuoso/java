
public class VerificandoLista {
	
		public static void main(String[] args) {
				ListaAluno listaAlunos = new ListaAluno();
				
				Aluno aluno1 = new Aluno();
				aluno1.nome = "Thiago";
				listaAlunos.adicionar(aluno1);
				
				Aluno aluno2 = new Aluno();
				aluno2.nome = "Mariana";
				listaAlunos.adicionar(aluno2);
				
				Aluno aluno3 = new Aluno();
				aluno3.nome = "Alexandre";
				listaAlunos.adicionar(aluno3);
				
				Aluno aluno4 = new Aluno();
				aluno4.nome = "Guilherme";
				listaAlunos.adicionar(aluno4);
				
				Aluno aluno5 = new Aluno();
				aluno5.nome = "Laura";
				listaAlunos.adicionar(aluno5);
				
				iterar(listaAlunos);
				
				listaAlunos.ordenar();
				
				iterar(listaAlunos);
				
				listaAlunos.remover(aluno3);
				
				iterar(listaAlunos);
		}
		
		static void iterar(ListaAluno listaAluno) {
				for (int i = 0; i <listaAluno.tamanho(); i++) {
						Aluno a = listaAluno.obter(i);
						if (a != null) {
								System.out.println("Aluno: " + a.nome);
						} else {
								System.out.println("Aluno sem nome");
						}
				}
				
				System.out.println("--------------------------------");
		}
}
