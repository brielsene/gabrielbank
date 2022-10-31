package br.com.gabrielbank.teste;

import java.util.ArrayList;

import br.com.gabrielbank.modelo.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {
//		Conta cc = new ContaCorrente(11, 22);
//		Conta cc2 = new ContaCorrente(11, 22);
//		
//		boolean igual = cc.ehIgual(cc2);
//		
//		System.out.println(igual);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
	

		Conta cc = new ContaCorrente(11, 22);
		lista.add(cc);

		Conta cc1 = new ContaCorrente(12, 24);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(12, 24);
		//lista.add(cc2);
		

			//System.out.println(lista.get(2));
		
		Conta teste = new ContaCorrente(123, 124);
		
			System.out.println(lista);
		
		
		
		
		
		
		boolean existe = cc1.equals(cc2);
		 
		System.out.println(existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
//	
//		for (Conta oRef : lista) {
//			if(oRef.ehIgual(cc)) {
//				System.out.println("Já tenho essa conta");
//			}
//			
//		}
//		

		
		
//		
//
	}

}
