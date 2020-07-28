package br.com.rd.rdevs.contas;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente>{

	@Override
	public String getTipoConta() {
		
		return "Corrente";
	}

	@Override
	public double getValorImporto() {
		
		System.out.println("Seu imposto é:" + (getSaldo() * 0.01));
		return getSaldo() * 0.1;
	}

	@Override
	public int compareTo(ContaCorrente outraConta) {
		
		if(this.getTitular() != outraConta.getTitular()) {
			
			return -1;
			
		}else {
			
			return this.getTitular().compareTo(outraConta.getTitular());
		}
	}
	
	

}
