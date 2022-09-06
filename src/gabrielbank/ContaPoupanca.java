package gabrielbank;

public class ContaPoupanca extends Conta implements Autenticacao {
	
	
	public ContaPoupanca (int agencia) {
		super(agencia);
	}
	

	
	public void sacaSaldo(double saldo) {
		 if(saldo<= super.getSaldo()) {
			 super.setSaldo(super.getSaldo()-saldo-2);
			 
		 }
		 else {
			 System.out.println("Saldo insuficiente");
		 }
		 
		 
	 }



	@Override
	public boolean autentica(int senha) {
		if(super.getSaldo()==senha) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
