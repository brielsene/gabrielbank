package br.com.gabrielbank.teste;

import java.util.*;

import br.com.gabrielbank.modelo.*;

public class TesteCompareSort2 {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(25, 33);
		cc1.depositaSaldo(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.depositaSaldo(444.0);

		Conta cc3 = new ContaCorrente(21, 11);
		cc3.depositaSaldo(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.depositaSaldo(222.0);

		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		//Antes da ordenação
		
		for (Conta conta : lista) {
			
			System.out.println(conta);
			
		}
		
		System.out.println();
		System.out.println("----------------------");
		System.out.println();
		
		
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		NumeroAgenciaComparator agenciaComparator = new NumeroAgenciaComparator();

		lista.sort(comparator);
		lista.sort(agenciaComparator);
		
		for (Conta conta : lista) {
			
			System.out.println(conta);
			
		}

	}

}


//Classe que compara as contas e ifs para numero da conta
class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		if (c1.getNumeroConta() > c2.getNumeroConta()) {
			return 1;
		}

		if (c1.getNumeroConta() < c2.getNumeroConta()) {
			return -1;
		}

		return 0;
	}

}

//Classe que compara as contas, e ifs para agencia
class NumeroAgenciaComparator implements Comparator <Conta>{

	@Override
	public int compare(Conta cc1, Conta cc2) {
		if(cc1.getAgencia()>cc2.getAgencia()) {
			return 1;
		}
		
		if (cc1.getAgencia()<cc2.getAgencia()) {
			return -1;
		}
		return 0;
	}
	
}
