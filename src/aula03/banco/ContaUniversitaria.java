package aula03.banco;

public class ContaUniversitaria extends Conta {
	
	public ContaUniversitaria(int numero, int agencia, String correntista, double saldo) {
		super(numero, agencia, correntista, saldo);
	}

	@Override
	public boolean depositar(double valor) {
		if ((super.getSaldo() + valor) <= 2000) {
			super.setSaldo(super.getSaldo() + valor);
			return true;
		} else {
			return false;
		}
	}	
}
