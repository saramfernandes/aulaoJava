package aula03.heranca;

public class Produto {
	
	private String nome;
	private double valor;
	
	public boolean ehCaro() {
		return valor > 100;
	}
	
	@Override
	public String toString() {
		return getNome() + " - R$" + getValor();
	}
	
	public Produto(String nome, double valor) {
		setNome(nome);
		setValor(valor);
	}
	
	public Produto() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
