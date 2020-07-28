package br.com.rd.rdevs.contas;

public abstract class Conta {

	//Atributos
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;
	private double rendimento = 0.1;
	private String tipoDeConta;
	


	//Construtores
	public Conta(){

	
	}
	public Conta(String titularToSet){
		this.titular = titularToSet;
	}
	
	//Get
	public String getTitular(){
		return this.titular;
	}
	public int getNumero(){
		return this.numero;
	}
	public String getAgencia(){
		return this.agencia;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public String getDataDeAbertura(){
		return this.dataDeAbertura;
	}
	public double getRendimento(){
		return this.rendimento;
	}
	
	public abstract String getTipoConta();

	//Sets
	public void setTitular(String titularToSet){
		this.titular = titularToSet;
	}
	public void setNumero(int numeroToSet){
		this.numero = numeroToSet;
	}
	public void setAgencia(String agenciaToSet){
		this.agencia = agenciaToSet;
	}
	public void setDataDeAbertura(String dataDeAberturaToSet){
		this.dataDeAbertura = dataDeAberturaToSet;
	}
	public String setTipoConta(String tipoContaToSet){
		return this.tipoDeConta = tipoContaToSet;
	}

	//Metodos
	public boolean sacar(double valorSacado){
		if(this.saldo < valorSacado) {
			throw new SaldoInsuficienteExceprion("Saldo Insuficiente Para Sacar");
		}else if(valorSacado <= 0){
			throw new IllegalArgumentException("Usuario esta tentando sacar valor negativo!");
			//return false;
		}else{	
			this.saldo = this.saldo - valorSacado;
			if(this.tipoDeConta == "Corrente") 
			{
				this.saldo = (this.saldo - 0.10) - valorSacado;
				return true;
			}else {
				this.saldo = this.saldo - valorSacado;
				return true;
			}
		}
	}
	public boolean depositar(double valorDepositado){
		if (valorDepositado < 0){
			throw new IllegalArgumentException("Usuario esta tentando depositar valor negativo!");
			//return false;
		}else{
			this.saldo += valorDepositado;
			return true;
		}	
	}
	public boolean trasferir(Conta contaParaTrasferencia, double valorTrasferido){
		if(this.saldo < valorTrasferido && valorTrasferido <= 0 && contaParaTrasferencia.numero != numero)
		{
			return false;

		}else{

			contaParaTrasferencia.depositar(valorTrasferido);
			this.saldo = this.saldo - valorTrasferido;
			return true;
		}
	}
	public double calcularRendimentoMensal(){
		if (this.saldo == 0){
			return 0;
		}else{
			double rendimentoMensal = this.saldo * rendimento;
			return rendimentoMensal;
		}	
	}
	

}
