package br.com.gabrielbank.modelo;

import java.io.Serializable;

/**
 * Classe representa conta, que inicializa com digitação de um atributo agência
 * @author Gabriel
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable
{
	 private int login;
	 private int senha;
	 private int agencia, numeroConta;
	 private Pessoa cliente;
	 static int total = 0;
	 private double saldo;
	 
	 
	 
	 public Conta(int agencia, int numeroConta ) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		total= total+1;
		 
	 }
	 
	 public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 
	 public int getAgencia() {
		return agencia;
	}
	 
	 public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	 
	 public int getNumeroConta() {
		return numeroConta;
	}
	 
	 public void setNumeroConta(int n_conta) {
		this.numeroConta = n_conta;
	}
	  
	 public int getLogin() {
		return login;
	}
	 
	 public void setLogin(int login) {
		this.login = login;
	}
	 
	 public int getSenha() {
		return senha;
	}
	 
	 public void setSenha(int senha) {
		this.senha = senha;
	}
	 
	 public Pessoa getCliente() {
		return cliente;
	}
	 
	 public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	 
	 public static int retornaTotal() {
		 return total;
	 }
	 
	/**
	 * Metodo para saque
	 * Valor precisa ser igual ou maior do que o this.saldo
	 * @param saldo
	 * @throws SaldoInsuficienteException
	 */
	 public void saca(double saldo) {
		
		 if(this.saldo<saldo) {
			//problema
			 throw new SaldoInsuficienteException("Saldo:  "+this.saldo +" , Valor: "+saldo);
		 }
		 
		 this.saldo = this.saldo - saldo;
		 
		 
		 
	 }
	 
	 public void transfere(double valor, Conta destino)throws SaldoInsuficienteException {
		 this.saca(valor);
		 destino.depositaSaldo(saldo);
		 
	 
		
	 }
	 
	 
	 public double depositaSaldo (double saldo) {
		 
		 return this.saldo = this.saldo + saldo;
		 
	 }
	 
	 public double getSaldo() {
		 return this.saldo;
	 }
	 
	 
	 @Override
	 public boolean equals(Object obj) {
		 
		 Conta outra = (Conta)obj;
		 if(this.agencia != outra.agencia) {
			return false;
			 
		 }
		 
		 if(this.numeroConta != outra.numeroConta) {
			 return false;
		 }
		 
		 return true;
		 
	 }
	 
	 

	 
	
	 /**
	  * Rescrita do metódo toString, padrão da classe Object do Java
	  */
	 
	 
	
	 //ordem natural
	 @Override
	public int compareTo(Conta outra) {
		// TODO Auto-generated method stub
		return Double.compare(this.saldo, outra.saldo);
	}
	 
	 
	 @Override
	 public String toString() {
		return "Número:"+this.numeroConta +" Agência "+this.agencia+" Pessoa: "+this.cliente+" / Saldo: "+this.saldo;
		 
	 }
	 
	 
	 
	
	

}
