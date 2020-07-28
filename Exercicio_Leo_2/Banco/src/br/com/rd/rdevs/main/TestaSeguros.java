package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.ManipuladorDeSeguroDeVida;
import br.com.rd.rdevs.contas.SeguroDeVida;

public class TestaSeguros {
	
	public static void main (String[] args) {
		
		ManipuladorDeSeguroDeVida criadorDeSeguro = new ManipuladorDeSeguroDeVida();
		
		SeguroDeVida seguro1 = criadorDeSeguro.criaSeguro("Ivo", 100, 174602);
		
		
		System.out.println("Titular: " + seguro1.getTitular() + "\n" + "Valor: " + seguro1.getValor() + "\n" + "Apolice: " + seguro1.getNumeroApolice() + "\n");
		
		
	}
}
