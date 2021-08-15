package com.maricode.impressao.impressoras;

import com.maricode.impressao.Impressora;
import com.maricode.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora{

	@Override
	public void imprimir(Imprimivel imprimivel) {
			System.out.println("******************************************************************************");
			System.out.println(imprimivel.getCabecalhoPagina());
			System.out.println("******************************************************************************");
			System.out.println(imprimivel.getCorpoPagina());
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("==				EPSON				==");
			System.out.println("--------------------------------------------------------------------------------");
			
	}

}
