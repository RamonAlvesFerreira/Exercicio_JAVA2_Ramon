package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.Conta;
import br.com.rd.rdevs.contas.ContaCorrente;
import br.com.rd.rdevs.contas.ContaPoupanca;


public class TestaConta {
	
	public static void main (String[] args) {
		
		ContaPoupanca poupanca;
		poupanca = new ContaPoupanca();
		
		poupanca.setTitular("Ramon");
		poupanca.setNumero(1234);
		poupanca.setTipoConta("Poupanca");
		poupanca.setDataDeAbertura("27/10/1999");
		poupanca.setAgencia("14578-5");
		
		//poupanca.sacar(450);
		
		System.out.println("O seu saldo é: " + poupanca.getSaldo() + " rs; \n");
		
		ContaCorrente corrente;
		corrente = new ContaCorrente();
		
		corrente.setTitular("Cut");
		corrente.setNumero(22);
		corrente.setTipoConta("Corrente");
		corrente.setDataDeAbertura("25/10/1998");
		corrente.setAgencia("58712-4");
		
		corrente.depositar(450);
		
		corrente.getValorImporto();
		
		ContaCorrente corrente2;
		corrente2 = new ContaCorrente();
		
		corrente2.setTitular("u");
		corrente2.setNumero(20);
		corrente2.setTipoConta("Corrente");
		corrente2.setDataDeAbertura("27/10/1999");
		corrente2.setAgencia("422327-5");
		
		corrente2.depositar(100);
		
		corrente2.getValorImporto();
		
		
		System.out.println("O que é esse: " + corrente.compareTo(corrente2));
		
		
	}
	

	
}
