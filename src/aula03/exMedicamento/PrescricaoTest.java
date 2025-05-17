package aula03.exMedicamento;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrescricaoTest {
	
	ArrayList<Medicamento> medicamentos;
	ArrayList<Pessoa> pessoas;
	
	@BeforeEach
	void inicializa() {
		medicamentos = new ArrayList<Medicamento>();
		
		Medicamento m1 = new Medicamento("Anador", "Comprimidos");
		m1.addIndicacoes("dor");
		m1.addIndicacoes("febre");
		m1.addAlergia("dengue");
		
		Medicamento m2 = new Medicamento("Buscopan", "Comprimidos");
		m2.addIndicacoes("dor");
		m2.addAlergia("fígado");
		
		medicamentos.add(m1);
		medicamentos.add(m2);
		
		pessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("João", "dor");
		p1.addAlergia("fígado");
		
		Pessoa p2 = new Pessoa("Ana", "dor");
		p2.addAlergia("dengue");
		
		Pessoa p3 = new Pessoa("Pedro", "pedras nos rins");

		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
	}

	@Test
	void precrisaoTest() {
		Prescricao p0 = new Prescricao(pessoas.get(0));
		Prescricao p1 = new Prescricao(pessoas.get(1));
		Prescricao p2 = new Prescricao(pessoas.get(2));
		
		assertTrue(p0.addMedicamento(medicamentos.get(0)));
		assertFalse(p0.addMedicamento(medicamentos.get(1)));
		
		assertTrue(p1.addMedicamento(medicamentos.get(1)));
		assertFalse(p1.addMedicamento(medicamentos.get(0)));
		
		assertFalse(p2.addMedicamento(medicamentos.get(0)));
		assertFalse(p2.addMedicamento(medicamentos.get(1)));
		
		
	}

}
