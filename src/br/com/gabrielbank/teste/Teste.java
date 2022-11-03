package br.com.gabrielbank.teste;

import java.util.*;

import br.com.gabrielbank.modelo.*;

public class Teste {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Pessoa clienteCC1 = new Pessoa();
		cc1.setSaldo(120.0);
		clienteCC1.setNome("Nico");
		cc1.setCliente(clienteCC1);
		

		Conta cc2 = new ContaPoupanca(22, 44);
		Pessoa clienteCC2 = new Pessoa();
		clienteCC2.setNome("Guilherme");
		cc2.setSaldo(130.0);
		cc2.setCliente(clienteCC2);
		

		Conta cc3 = new ContaCorrente(22, 11);
		Pessoa clienteCC3 = new Pessoa();
		clienteCC3.setNome("Paulo");
		cc3.setSaldo(10.0);
		cc3.setCliente(clienteCC3);

		Conta cc4 = new ContaPoupanca(22, 22);
		Pessoa clienteCC4 = new Pessoa();
		clienteCC4.setNome("Ana");
		cc4.setSaldo(100.0);
		cc4.setCliente(clienteCC4);

		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		//NumeroDaContaComparator2 comparator = new NumeroDaContaComparator2();
		TitularDaContaComparator comparator2 = new TitularDaContaComparator();
		
		
		lista.sort(new 
				Comparator<Conta>() {//classe anonima

			@Override
			public int compare(Conta c1, Conta c2) {

				return (c1.getNumeroConta()-c2.getNumeroConta());
				

			}

		}
				
				
				
				
				);
		
		
		
		System.out.println();
		//System.out.println("Ordenado por saldo");
		
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
			
		}
		
		System.out.println();
		System.out.println("Ordenado pelo nome:");
		Comparator <Conta> comp = new Comparator<Conta>() {

			@Override
			public int compare(Conta c1, Conta c2) {

				String nomeC1 = c1.getCliente().getNome();
				String nomeC2 = c2.getCliente().getNome();
				//método para comparar, object.compareTo();
				return nomeC1.compareTo(nomeC2);
			}

		};
	
	}

}

//Classe que compara as contas e ifs para numero da conta



class NumeroAgenciaComparator2 implements Comparator<Conta> {

	@Override
	public int compare(Conta cc1, Conta cc2) {
		return (cc1.getAgencia() - cc2.getAgencia());
		
	}


}
