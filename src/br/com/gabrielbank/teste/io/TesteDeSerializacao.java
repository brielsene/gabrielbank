package br.com.gabrielbank.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import br.com.gabrielbank.modelo.*;

public class TesteDeSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		
		ois.close();
		
		System.out.println(cc.getSaldo());
		System.out.println(cc.getCliente());

	}

}
