package br.com.gabrielbank.teste;

import br.com.gabrielbank.modelo.*;

import java.util.Random;
import java.util.Scanner;

public class TestaConta {
	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);

		
		 
			
				
				System.out.println("Digite o código da agência que deseja: ");
				int agencia = scan.nextInt();

				Conta c = new ContaCorrente(12, 22);

				System.out.println("Digite seu nome: ");
				String nome = scan.next();
				Pessoa p = new Pessoa();
				c.setCliente(p);
				c.getCliente().setNome(nome);
				System.out.println("Digite seu cpf: ");
				String cpf = scan.next();
				c.getCliente().setCpf(cpf);
				System.out.println("Digite sua data de nascimento: ");
				String dt_nascimento = scan.next();
				c.getCliente().setDt_nascimento(dt_nascimento);
				System.out.println("Digite sua senha com números: ");
				c.setSenha(311);
 
				System.out.println("Conferir dados \n");
				System.out.println("Nome: " + c.getCliente().getNome() + "\n" + "CPF: " + c.getCliente().getCpf() + "\n"
						+ "Data de nascimento: " + c.getCliente().getDt_nascimento());
				System.out.println("Se estiverem corretos, digite 1, caso n�o, digite 0 para cadastrar novamente");
				int conf2;
				conf2 = scan.nextInt();

				if (conf2 == 1) {
					System.out.println("Cadastrado com sucesso");
				}

				else {
					System.out.println("Cadastrar novamente");

				}

			

			
			
		

		 }
		 
	}
		 
		


