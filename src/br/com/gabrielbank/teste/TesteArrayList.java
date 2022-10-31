package br.com.gabrielbank.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.gabrielbank.modelo.*;

import br.com.gabrielbank.modelo.GuardadorDeContas;

public class TesteArrayList {

	public static void main(String[] args) {
//		GuardadorDeContas guardador = new GuardadorDeContas();
//		
//		Conta cc = new ContaCorrente(22, 11);
//		guardador.adiciona(cc);
//		
//		Conta cp = new ContaPoupanca(222, 11);
//		guardador.adiciona(cp);
//		
//		int tamanho = guardador.getQuantidadeDeElementos();
//		System.out.println(tamanho);
//		
//		ContaCorrente ref = (ContaCorrente)guardador.getReferencia(0);
//		System.out.println(ref.getNumeroConta());

		// <>"Generics" Serve para delimitar que nesse ArrayList, servirá apenas para objetos do
		// tipo conta

		List<Conta> lista = new ArrayList<Conta>();
		List<Conta> listaLinked = new LinkedList<Conta>();
		ArrayList <Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		

		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();

		listaPessoa.add(p);
		listaPessoa.add(p2);
		
		p2.setNome("Isadora");
		
		
		Pessoa pRef = (Pessoa)listaPessoa.get(0);
		pRef.setNome("Gabriel");
		
		for(int i=0;  i<listaPessoa.size();i++) {
			System.out.println("Nome:"+listaPessoa.get(i));
		}

		System.out.println(listaPessoa.size());
		System.out.println(pRef);

		Conta cc = new ContaCorrente(11, 22);
		lista.add(cc);

		Conta cc1 = new ContaCorrente(12, 24);
		lista.add(cc1);

		Conta cp = new ContaPoupanca(12, 55);
		lista.add(cp);
		
		

//		System.out.println(lista.get(0));
//		System.out.println(lista.get(1));

		System.out.println("Quantas posições ocupam: " + lista.size());

		Conta ref = (Conta) lista.get(1);

//		for (int i=0;i < lista.size();i++) {
//			
//		Object oRef = lista.get(i);
//		System.out.println(oRef);
//			
//		
//		
//		
////		for(int i=0; i<lista.size();i++) {
////			Object oRef = lista.get(i);
////			System.out.println(oRef);
////			
////			
//		}

		// for melhorado

		for (Conta oRef : lista) {
			System.out.println(oRef);
		}
		
		for (Pessoa peRef : listaPessoa) {
			System.out.println(peRef);
		}

	}

}
