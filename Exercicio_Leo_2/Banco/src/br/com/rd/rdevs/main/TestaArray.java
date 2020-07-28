package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.Conta;
import br.com.rd.rdevs.contas.ContaCorrente;
import br.com.rd.rdevs.contas.ContaPoupanca;

public class TestaArray {
	
	public static void main (String[] args) {

		Conta[] contas = new Conta[10];
		double mediaSaldos = 0;
	
		for(int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100);
			contas[i] = conta;
		}
		
		for(int i = 0; i < contas.length; i++) {

			mediaSaldos += contas[i].getSaldo();
		}
		
		System.out.println("A media dos saldos eh: " + (mediaSaldos / contas.length));
		
	}
	
	
	
}
