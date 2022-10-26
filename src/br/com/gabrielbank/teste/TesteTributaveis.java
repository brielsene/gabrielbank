package br.com.gabrielbank.teste;

import br.com.gabrielbank.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 12);
		
		cc.depositaSaldo(100.0);
		
		SeguroDeVida seguro  = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());

	}

}
