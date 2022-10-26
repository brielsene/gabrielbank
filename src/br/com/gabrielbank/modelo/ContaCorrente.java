package br.com.gabrielbank.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numeroConta) {
		super(agencia, numeroConta);
		
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo() *0.01;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Corrente "+super.toString();
	}
	
	

}
