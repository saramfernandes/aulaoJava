package aula03.heranca;

public class Carro extends Produto{
	
	private int ano;
	
	public Carro(String nome, double valor, int ano) {
		super(nome, valor);
		setAno(ano);
	}
	
	@Override
	public boolean ehCaro() {
		return getValor() > 100_000;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	

}
