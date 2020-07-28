package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.ContaCorrente;
import br.com.rd.rdevs.model.Banco;

public class TestaBanco {
	
	public static void main (String[] args) {
		
		Banco bancos = new Banco();
		
		ContaCorrente corrente = new ContaCorrente();
		
		corrente.setTitular("Ramon");
		
		bancos.addConta(corrente);
		
		
		
		System.out.println(bancos.getQuantContas());
		
	}
}
