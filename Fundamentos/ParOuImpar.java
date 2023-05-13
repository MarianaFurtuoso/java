package fundamentos;

import javax.swing.JOptionPane;

public class ParOuImpar {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Numéro par!");
		} else {
			System.out.println("Número ímapar!");
		}
		
	}

}
