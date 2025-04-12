package aula02.campeonato;

public class Jogador {
	
	private String nome;
	private int camisa;
	private int gols;
	
	public Jogador(String nome, int camisa, int gols) {
		setNome(nome);
		setCamisa(camisa);
		setGols(gols);
	}
	
	public String getNome() {
		if (gols == 0)
			return "(-)" + nome;
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCamisa() {
		return camisa;
	}
	
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	
	public int getGols() {
		return gols;
	}
	
	public void setGols(int gols) {
		if (gols >= 0) {
			this.gols = gols;
		}else {
			throw new NumberFormatException("Gols inválido");
		}
	}
	
	@Override
	public String toString() {
		return getNome() + " - " + getCamisa() + " - " + getGols();
	}
	

}
