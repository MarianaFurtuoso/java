
public class Principal {
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro(); 
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabrica��o = 2011;
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.anoDeFabrica��o = 2009;
		
		System.out.println("Meu carro");
		System.out.println("---------------------");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabrica��o);
		
		System.out.println();
		System.out.println("Seu carro");
		System.out.println("------------------------");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoDeFabrica��o);
	}

}
