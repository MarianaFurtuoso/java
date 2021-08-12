package com.maricode.MatematicaUtil;

import com.maricode.fibonacci.CalculoFibonacci;
import com.maricode.areadocirculo.CalculoDaArea;


public class MatematicaUtil {

	public static void main(String[] args) {
		int numeroFibonacci = CalculoFibonacci.calcularFibonacci(8);
		System.out.println("N�mero de Fibonacci da posi��o 8: " + numeroFibonacci);
		
		double areaCirculo = CalculoDaArea.calcularAreaCirculo(104.8);
		System.out.println("�rea do c�rculo: " + areaCirculo);
	}
}
