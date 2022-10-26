package br.com.gabrielbank.teste;

import br.com.gabrielbank.modelo.*;

public class TesteArray {

	public static void main(String[] args) {
		
		// alterando o tipo
        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        // cria instância de ContaPoupanca
        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2;    

        System.out.println(contas[1].getNumeroConta()  );

        // (ContaCorrente) usando cast para compilar;
        ContaCorrente ref = (ContaCorrente)contas[0];
        System.out.println(ref.getAgencia());
        System.out.println(ref.getNumeroConta());
		
		
		

	}

}
