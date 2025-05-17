package aula03.banco;

public class ContaEspecial extends Conta {
	
	private double limite;
	
	@Override
	public boolean sacar(double valor) {
		if (super.getSaldo() >= valor && valor <= limite) {
			super.setSaldo(super.getSaldo() - valor);
			return true;
		} else {
			return false;
		}
	}
	
	public ContaEspecial(int numero, int agencia, String correntista, double saldo, double limite) {
		super(numero, agencia, correntista, saldo);
		setLimite(limite);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
