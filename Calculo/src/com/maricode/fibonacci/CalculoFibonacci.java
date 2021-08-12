package com.maricode.fibonacci;

public class CalculoFibonacci {

	public static int calcularFibonacci(int x) {
		if (x < 2) {
			return x;
		}
		return calcularFibonacci(x - 1) + calcularFibonacci(x - 2);
	}

}
