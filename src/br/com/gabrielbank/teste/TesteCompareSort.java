package br.com.gabrielbank.teste;

import java.util.*;

import br.com.gabrielbank.modelo.*;

public class TesteCompareSort {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Pessoa clienteCC1 = new Pessoa();
		clienteCC1.setNome("Nico");
		cc1.setCliente(clienteCC1);
		

		Conta cc2 = new ContaPoupanca(22, 44);
		Pessoa clienteCC2 = new Pessoa();
		clienteCC2.setNome("Guilherme");
		cc2.setCliente(clienteCC2);
		

		Conta cc3 = new ContaCorrente(22, 11);
		Pessoa clienteCC3 = new Pessoa();
		clienteCC3.setNome("Paulo");
		cc3.setCliente(clienteCC3);

		Conta cc4 = new ContaPoupanca(22, 22);
		Pessoa clienteCC4 = new Pessoa();
		clienteCC4.setNome("Ana");
		cc4.setCliente(clienteCC4);

		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// Antes da ordenação

		for (Conta conta : lista) {

			System.out.println(conta +" Nome: " +conta.getCliente().toString());

		}

		System.out.println();
		System.out.println("----------------------");
		System.out.println();

		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		NumeroAgenciaComparator agenciaComparator = new NumeroAgenciaComparator();
		TitularDaContaComparator tcc = new TitularDaContaComparator();

		lista.sort(comparator);
		lista.sort(agenciaComparator);
		lista.sort(tcc);

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getCliente().toString());
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
class NumeroAgenciaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta cc1, Conta cc2) {
		if (cc1.getAgencia() > cc2.getAgencia()) {
			return 1;
		}

		if (cc1.getAgencia() < cc2.getAgencia()) {
			return -1;
		}
		return 0;
	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		String nomeC1 = c1.getCliente().getNome();
		String nomeC2 = c2.getCliente().getNome();
		//método para comparar, object.compareTo();
		return nomeC1.compareTo(nomeC2);
	}
}
