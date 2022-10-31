package br.com.gabrielbank.teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.com.gabrielbank.modelo.*;

public class TesteListLinked {

	public static void main(String[] args) {
		List<Conta> lista2 = new ArrayList<Conta>();
		List <Conta>lista = new LinkedList<Conta>();
		
		Conta c = new ContaCorrente(11, 30);
		Conta c1 = new ContaCorrente(12, 30);
		Conta c2 = new ContaCorrente(13, 30);
		Conta c3 = new ContaCorrente(14, 30);
		
		lista.add(c);
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		lista2.add(c);
		lista2.add(c1);
		lista2.add(c2);
		lista2.add(c3);
		
		
		
		for (Object obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------");
		for (Object obj : lista2) {
			System.out.println(obj);
		}
		System.out.println("-------------");
		
		lista.remove(1);
		lista2.remove(1);
		
		for (Object obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("------------");
		
		for (Object obj : lista2) {
			System.out.println(obj);
		}
		
		
		
		
		

	}

}
