import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class Ordenacao {
	
		public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\Users\\maria\\OneDrive\\Documentos\\lista.txt");
		
		
		List<String> nomes = Files.readAllLines(arquivo);
		
		ListaPessoas listaPessoas = new ListaPessoas();
		
		for (int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);
			
			Pessoa pessoa = new Pessoa();
			pessoa.nome = nome;
			
			listaPessoas.adicionar(pessoa);
		}
		
		listaPessoas.ordenacao();
		
		List<String> nomesOrdenados = new ArrayList<String>();
		for(int i = 0; i < listaPessoas.tamanho(); i++) {
				Pessoa pessoa = listaPessoas.obter(i);
				nomesOrdenados.add(pessoa.nome);
		}
		
		Path novoArquivo = Paths.get("C:\\Users\\maria\\OneDrive\\Documentos\\lista2.txt");
		Files.write(novoArquivo, nomesOrdenados);
}

		
		}

		
	

