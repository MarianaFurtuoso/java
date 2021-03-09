
public class Produto {
	
	void definirPreco(Preco preco, double percentualImposto, 
					double margemLucro) {
			preco.valorImposto = preco.valorCusto
					* (percentualImposto/100);
			preco.valorLucro = preco.valorCusto * (margemLucro/100);
			preco.precoVenda = preco.valorCusto + preco.valorImposto + preco.valorLucro;
	}

}
