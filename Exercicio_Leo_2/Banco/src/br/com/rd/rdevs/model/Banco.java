package br.com.rd.rdevs.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.rd.rdevs.contas.Conta;

public class Banco {
	
	List<Conta> contas;
	Map<String, Conta> totalContas;
	
	
	public Banco() {
		contas = new ArrayList<Conta>();
		totalContas = new HashMap();
	}
	
	public void addConta(Conta addConta) {
		this.contas.add(addConta);
		this.totalContas.put(addConta.getTitular(), addConta);
	}
	
	public Conta getConta(int index) {
		return this.contas.get(index);
	}
	
	public int getQuantContas() {
		return this.totalContas.size();
	}
	
	public Conta searchTitualar (String getNome) {
		return this.totalContas.get(getNome);
	}

	
}
