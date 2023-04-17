package bibliotecaemail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {
	
		public static void main(String[] args) throws IOException, EmailException  {
			
			Scanner scanner = new Scanner(System.in);
			
			ArrayList<String> linhas = new ArrayList<String>();
			
			String tarefa;
			int i = 0;
			while (true) {
					System.out.println("Tarefa  " + (i+1) + ": ");
					tarefa = scanner.nextLine();
					
					if ("x".equals(tarefa)) {
							break;
					}
					
					linhas.add(tarefa);
					i++;
			}
			
			String tarefas = "";
			
			for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
					tarefas += linhas.get(iteracao) + "\n";
			}
			
			String mensagem = "Suas tarefas: \n" + tarefas;
			
			System.out.println("Digite seu e-mail: ");
			String para = scanner.nextLine();
			
			Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
			
			scanner.close();
			
				
		}

}
