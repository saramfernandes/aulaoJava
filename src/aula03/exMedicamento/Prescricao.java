package aula03.exMedicamento;

import java.util.ArrayList;

public class Prescricao {

	private Pessoa pessoa;
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	
	public Prescricao(Pessoa pessoa) {
		setPessoa(pessoa);
	}
	
	public boolean addMedicamento(Medicamento med) {
		if (med.ehIndicadoPara(pessoa.getSintoma()) && !med.ehContraIndicadoPara(pessoa.getAlergias())) {
			medicamentos.add(med);
			return true;
		}
		return false;		
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
}
