package aula02.campeonato;

import java.util.ArrayList;

public class Time {
	
	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public Time(String nome) {
		setNome(nome);
	}
	
	public void addJogador(Jogador jogador) {
		if (jogadores.size() < 14) {
			jogadores.add(jogador);
		}
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public String listaJogadores() {
		String ret = " ";
		for (Jogador jogador : jogadores) {
			ret += jogador.toString() + "\n";
		}
		return ret;
	}
	
	public Jogador getArtilheiro() {
		if (getGols() == 0) {
			return null;
		}
		if (jogadores.size() > 0) {
			Jogador art = jogadores.get(0);
			for (Jogador jogador : jogadores) {
				if (jogador.getGols() > art.getGols()) {
					art = jogador;
				}
			}
			return art;
		}
		return null;
	}
	
	public int getGols() {
		int gols = 0;
		for (Jogador jogador : jogadores) {
			gols += jogador.getGols();
		}
		return gols;
	}

}
