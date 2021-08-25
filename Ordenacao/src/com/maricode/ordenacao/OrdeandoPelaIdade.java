package com.maricode.ordenacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdeandoPelaIdade {
	
		public static void main(String[] args) {
				Pessoa p1 = new Pessoa("João", 21);
				Pessoa p2 = new Pessoa("Adriana", 23);
				Pessoa p3 = new Pessoa("Guilherme", 22);
				
				List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
				IdadeComparator idadeComparator = new IdadeComparator();
				
				pessoas.sort(idadeComparator);
				pessoas.forEach(System.out::println);
				
		}

}
