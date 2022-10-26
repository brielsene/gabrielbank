package br.com.gabrielbank.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
