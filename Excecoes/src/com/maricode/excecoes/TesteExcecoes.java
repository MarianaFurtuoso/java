package com.maricode.excecoes;

public class TesteExcecoes {
	
		public static void main(String[] args) {
				
				ContaCorrente cc = new ContaCorrente(100);
				
				try {
						cc.depositar(-10);
						
				} catch(IllegalArgumentException e) {
						System.out.println("Voc� executou uma opera��o ilegal: "+ e.getMessage());
				}
		}

}
