package aula03.exMedicamento;

import java.util.ArrayList;

public class Medicamento {

	private String nome;
	private String administracao;
	private ArrayList<String> alergias = new ArrayList<String>();
	private ArrayList<String> indicacoes = new ArrayList<String>();
	
	public Medicamento(String nome, String administracao) {
		setNome(nome); 
		setAdministracao(administracao);
	}
	
	public void addAlergia(String alergia) {
		alergias.add(alergia.toUpperCase());
	}
	
	public void addIndicacoes(String indicacao) {
		indicacoes.add(indicacao.toUpperCase());
	}
	
	public boolean ehIndicadoPara(String sintoma) {
		for (String ind : indicacoes) {
			if (ind.equals(sintoma)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean ehContraIndicadoPara(ArrayList<String> alergiasPessoa) {
		for (String alMed : alergias) {
			for (String alPes : alergiasPessoa) {
				if (alMed.equals(alPes)) {
					return true;
				}
			}
		}
		return false;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	public String getAdministracao() {
		return administracao;
	}
	
	public void setAdministracao(String administracao) {
		this.administracao = administracao.toUpperCase();
	}
	
	public ArrayList<String> getAlergias() {
		return alergias;
	}
	
	public void setAlergias(ArrayList<String> alergias) {
		this.alergias = alergias;
	}
	
	public ArrayList<String> getIndicacoes() {
		return indicacoes;
	}
	
	public void setIndicacoes(ArrayList<String> indicacoes) {
		this.indicacoes = indicacoes;
	}
	
	
	
}
