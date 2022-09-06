package gabrielbank;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia) {
		super(agencia);
		
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo() *0.01;
	}
	
	

}
