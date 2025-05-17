package aula03.banco;

public class Conta {
	
	private int numero;
	private int agencia;
	private String correntista;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, String correntista, double saldo) {
		setNumero(numero);
		setAgencia(agencia);
		setCorrentista(correntista);
		setSaldo(saldo);
	}
	
	public boolean depositar(double valor) {
		setSaldo(getSaldo() + valor);
		return true;
	}
	
	public boolean sacar(double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() + valor);
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Conta conta) {
		if (sacar(valor)) {
			if (conta.depositar(valor)) {
				return true;
			} else {
				depositar(valor);
				return false;
			}
		}
		return false;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public String getCorrentista() {
		return correntista;
	}
	
	public void setCorrentista(String correntista) {
		this.correntista = correntista.toUpperCase();
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
