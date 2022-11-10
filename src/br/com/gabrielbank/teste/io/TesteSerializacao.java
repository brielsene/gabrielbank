package br.com.gabrielbank.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.gabrielbank.modelo.*;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Pessoa p = new Pessoa();
		p.setNome("Gabriel Sene");
		p.setCpf("518709999");
		p.setDt_nascimento("30/03/2005");
		
		ContaCorrente cc = new ContaCorrente(12, 22);
		cc.setCliente(p);
		cc.depositaSaldo(120.0);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
		

	}

}
