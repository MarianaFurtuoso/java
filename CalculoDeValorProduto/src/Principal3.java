
public class Principal3 {

	public static void main(String[] args) {
			Preco preco = new Preco();
			preco.valorCusto = 140;
			
			Produto produto = new Produto();
			produto.definirPreco(preco, 20,15);
			
			System.out.println("Valor custos: " + preco.valorCusto);
			System.out.println("Valor impostos: " + preco.valorImposto);
			System.out.println("Valor lucro: " + preco.valorLucro);
			System.out.println("Valor de venda: " + preco.precoVenda);
	}

}
