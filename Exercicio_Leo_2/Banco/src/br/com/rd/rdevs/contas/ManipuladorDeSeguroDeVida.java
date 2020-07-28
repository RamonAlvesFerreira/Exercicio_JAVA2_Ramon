package br.com.rd.rdevs.contas;

public class ManipuladorDeSeguroDeVida {
	
	private SeguroDeVida segVida;
	
	public SeguroDeVida criaSeguro(String titularToSet, double valorToSet, int numeroApoliceToSet){
		
		SeguroDeVida seguroCriado = new SeguroDeVida();
		seguroCriado.setTitular(titularToSet);
		seguroCriado.setValor(valorToSet);
		seguroCriado.setNumeroApolice(numeroApoliceToSet);
		
		return seguroCriado;
		
	}
	
	

}
