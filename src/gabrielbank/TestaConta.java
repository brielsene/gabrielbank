package gabrielbank;

import java.util.Random;
import java.util.Scanner;

public class TestaConta {
	public static void main(String[] args) {

		
		System.out.println("Deseja abrir uma nova conta? digite s:");
		Scanner scan = new Scanner(System.in);
		String conf = scan.next();
		if(conf.equals("s")) {
			System.out.println("Digite o código da agência que deseja: ");
			int agencia = scan.nextInt();
			
			
			Conta c = new Conta (agencia);
			
			
			System.out.println("Digite seu nome: ");
			String nome = scan.next();
			Pessoa p = new Pessoa(nome);
			c.setCliente(p);
			
		}
		
		else {
			System.out.println("Até logo");
		}
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	
	}

}
