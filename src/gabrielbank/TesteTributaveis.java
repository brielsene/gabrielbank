package gabrielbank;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222);
		
		cc.depositaSaldo(100.0);
		
		SeguroDeVida seguro  = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());

	}

}
