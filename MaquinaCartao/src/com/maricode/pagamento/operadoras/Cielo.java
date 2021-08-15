package com.maricode.pagamento.operadoras;

import com.maricode.pagamento.Autorizavel;
import com.maricode.pagamento.Cartao;
import com.maricode.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
					&& autorizavel.getValorTotal() < 1000;
	}

}
