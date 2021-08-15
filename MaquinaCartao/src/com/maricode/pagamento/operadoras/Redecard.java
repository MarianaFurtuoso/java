package com.maricode.pagamento.operadoras;

import com.maricode.pagamento.Autorizavel;
import com.maricode.pagamento.Cartao;
import com.maricode.pagamento.Operadora;

public class Redecard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
			return cartao.getNumeroCartao().startsWith("456")
						&& autorizavel.getValorTotal() < 10000;
	}

}
