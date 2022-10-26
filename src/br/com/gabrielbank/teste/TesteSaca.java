package br.com.gabrielbank.teste;

import br.com.gabrielbank.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 11);
		conta.depositaSaldo(200);
		
		try {

			conta.saca(210);
		} catch (SaldoInsuficienteException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			//ex.printStackTrace();

		}
		
	
		

		System.out.println("Saldo da conta: " + conta.getSaldo());

	}

}
