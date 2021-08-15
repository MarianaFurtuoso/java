package com.maricode.teste;

import com.maricode.caixa.Checkout;
import com.maricode.caixa.Compra;
import com.maricode.impressao.Impressora;
import com.maricode.impressao.impressoras.ImpressoraEpson;
import com.maricode.impressao.impressoras.ImpressoraHP;
import com.maricode.pagamento.Cartao;
import com.maricode.pagamento.Operadora;
import com.maricode.pagamento.operadoras.Cielo;
import com.maricode.pagamento.operadoras.Redecard;

public class TesteCheckout {
	
	
		public static void main(String[] args) {
			Operadora operadora = new Cielo();
			Impressora impressora = new ImpressoraEpson();
			
			/*
			Cartao cartao = new Cartao();
			cartao.setNomeTitular("Guilherme A Moreira");
			cartao.setNumeroCartao("456");
			
			
			Compra compra = new Compra();
			compra.setNomeCliente("Guilherme Augusto Moreira");
			compra.setProduto("Vestido");
			compra.setValorTotal(1000);
			
			Checkout checkout = new Checkout(operadora, impressora);
			checkout.fecharCompra(compra, cartao);
			*/
		
			Cartao cartao = new Cartao();
			cartao.setNomeTitular("Mariana M Silva");
			cartao.setNumeroCartao("123");
			
			
			Compra compra = new Compra();
			compra.setNomeCliente("Mariana Moraes Silva");
			compra.setProduto("Sapato");
			compra.setValorTotal(500);
			
			Checkout checkout = new Checkout(operadora, impressora);
			checkout.fecharCompra(compra, cartao);
			
		}
	

}
