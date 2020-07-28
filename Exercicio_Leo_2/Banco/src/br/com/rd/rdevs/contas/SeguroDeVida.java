package br.com.rd.rdevs.contas;

public class SeguroDeVida implements Tributavel{
	
	private String titular;
	private int numeroApolice;
	private double valor;
	
	
	//METHODs

	@Override
	public double getValorImporto() {
		System.out.println("Seu imposto é:" + (valor * 0.2 + 42));
		return valor * 0.2 + 42;
	}
	
	
	//SETs
	public int setNumeroApolice(int numeroApoliceToSet) {
		return this.numeroApolice = numeroApoliceToSet;
	}
	public double setValor(double valorToSet) {
		return this.valor = valorToSet;
	}
	public String setTitular(String titularToSet) {
		return this.titular = titularToSet;
	}
	

	//GETs
	public int getNumeroApolice() {
		return this.numeroApolice;
	}
	public double getValor() {
		return this.valor;
	}
	public String getTitular() {
		return this.titular;
	}


}
