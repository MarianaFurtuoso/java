
public class Principal1 {
	
		public static void main(String[] args) {
			Carro meuCarro = new Carro();
			meuCarro.anoDeFabricação = 2011;
			meuCarro.cor = "Prata";
			meuCarro.fabricante = "Fiat";
			meuCarro.modelo = "Palio";
			
			meuCarro.dono = new Proprietario();
			meuCarro.dono.nome = "Joao da Silva";
			meuCarro.dono.bairro = "Centro";
			
			meuCarro.ligar();
			
		}

}
