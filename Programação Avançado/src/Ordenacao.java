import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class Ordenacao {
	
		public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\Users\\maria\\OneDrive\\Documentos\\TESTE.odt");
		
		
		List<String> nomes = Files.readAllLines(arquivo);
		
		ListaPessoas listaPessoas = new ListaPessoas();
		
		for (int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);
			
			Pessoa pessoa = new Pessoa();
			pessoa.nome = nome;
			
			System.out.println("(" + (i +1) + ") " + nome);
		}
}

		
		}

		
	

