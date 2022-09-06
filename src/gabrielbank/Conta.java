package gabrielbank;

public abstract class Conta {
	 private int login;
	 private int senha;
	 private int agencia;
	 private Pessoa cliente;
	 static int total = 0;
	 private double saldo;
	 
	 
	 
	 public Conta(int agencia) {
		this.agencia = agencia;
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
	 
	 public void sacaSaldo(double saldo) {
		 if(saldo<= this.saldo) {
			 this.saldo = this.saldo - saldo;
		 }
		 else {
			 System.out.println("Saldo insuficiente");
		 }
		 
		 
	 }
	 public double depositaSaldo (double saldo) {
		 
		 return this.saldo = this.saldo + saldo;
		 
	 }
	 
	 public double getSaldo() {
		 return this.saldo;
	 }
	

}
