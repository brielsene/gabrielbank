package br.com.gabrielbank.teste;

import java.util.ArrayList;

import br.com.gabrielbank.modelo.*;

import br.com.gabrielbank.modelo.GuardadorDeContas;

public class Teste {

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
		
		ArrayList lista = new ArrayList();
		
		
		Conta cc = new ContaCorrente(11, 22);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(12, 24);
		lista.add(cc1);
		
		Conta cp = new ContaPoupanca(12, 55);
		lista.add(cp);
		
//		System.out.println(lista.get(0));
//		System.out.println(lista.get(1));
		
		System.out.println("Quantas posições ocupam: "+lista.size());
		
		Conta ref = (Conta)lista.get(1);
		
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
		
		//for melhorado
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
		
		
		
		
		
		
		

	}

}
