package aula03.exMedicamento;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String sintoma;
	private ArrayList<String> alergias = new ArrayList<String>();
	
	public Pessoa(String nome, String sintoma) {
		setNome(nome);
		setSintoma(sintoma);
	}
	
	public void addAlergia(String alergia) {
		alergias.add(alergia.toUpperCase());
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	public String getSintoma() {
		return sintoma;
	}
	
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma.toUpperCase();
	}

	public ArrayList<String> getAlergias() {
		return alergias;
	}

	public void setAlergias(ArrayList<String> alergias) {
		this.alergias = alergias;
	}
	
}
