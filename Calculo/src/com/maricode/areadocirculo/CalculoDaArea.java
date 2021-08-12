package com.maricode.areadocirculo;

public class CalculoDaArea {
	
	static final double PI = 3.14;

	public static Double calcularAreaCirculo(double raio) {

		double areaCirculo = Math.sqrt(raio) * PI;

		return areaCirculo;
	}

	

}