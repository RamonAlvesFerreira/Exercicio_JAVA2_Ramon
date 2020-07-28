package br.com.rd.rdevs.model;

public abstract class Funcionario {
	
	private String nome;
    private String cpf;
    private double salario;
	private double porcentBonificacao;

	public abstract double bonificacao();
	
	public double getPorcentBonificacao()
	{
		return this.porcentBonificacao;
	}
	public double setPorcentBonificacao(double porcent)
	{
		return this.porcentBonificacao = porcent;
	}
}
