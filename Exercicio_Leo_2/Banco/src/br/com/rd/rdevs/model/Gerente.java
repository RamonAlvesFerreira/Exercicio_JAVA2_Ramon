package br.com.rd.rdevs.model;

import br.com.rd.rdevs.model.Funcionario;
import br.com.rd.rdevs.model.Gerente;

public class Gerente extends Funcionario{
	
	private int numeroDeFuncionariosGerenciados = 0;
	private int senha;
	
	public void getFuncionario() {
		
		
		//Gerente g = (Gerente) f;
		
		Gerente g;
		g = new Gerente();
		
	}
	@Override
	public double bonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean autentica(int senha)
    {
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
            
        }
    }
	//public double bonificacao(double salario) {
	//	setPorcentBonificacao(1.15);
	//	return salario * getPorcentBonificacao();
	//}
	
}
