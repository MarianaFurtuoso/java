
public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricação;
	
	Proprietario dono;
	
	void ligar() {
		System.out.println("Ligando carro: " + modelo);
	}
}
