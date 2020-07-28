package br.com.rd.rdevs.contas;

public class SaldoInsuficienteExceprion extends RuntimeException{
	
	public SaldoInsuficienteExceprion(String message) {
		super(message);
	}

}
