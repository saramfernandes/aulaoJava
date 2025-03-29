package aula01.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aula01.Pessoa;

// Teste normal
class PessoaTeste {

	@Test
	void avaliacaoTest() {
		Pessoa mAbaixoPeso = new Pessoa();
		Pessoa mAcimaPeso = new Pessoa();
		Pessoa mPesoNormal = new Pessoa();
		
		Pessoa fAbaixoPeso = new Pessoa();
		Pessoa fAcimaPeso = new Pessoa();
		Pessoa fPesoNormal = new Pessoa();
		
		mAbaixoPeso.cadastrar("Homem 1", 30, 1.90, 'M');
		mAcimaPeso.cadastrar("Homem 2", 130, 1.50, 'M');
		mPesoNormal.cadastrar("Homem 3", 70, 1.75, 'M');
	
		fAbaixoPeso.cadastrar("Mulher 1", 30, 1.90, 'F');
		fAcimaPeso.cadastrar("Mulher 2", 130, 1.50, 'F');
		fPesoNormal.cadastrar("Mulher 3", 70, 1.75, 'F');
		
		assertEquals("Homem 1: Abaixo do Peso", mAbaixoPeso.toString());
		assertEquals("Homem 2: Acima do Peso", mAcimaPeso.toString());
		assertEquals("Homem 3: Peso Normal", mPesoNormal.toString());
		
		assertEquals("Mulher 1: Abaixo do Peso", fAbaixoPeso.toString());
		assertEquals("Mulher 2: Acima do Peso", fAcimaPeso.toString());
		assertEquals("Mulher 3: Peso Normal", fPesoNormal.toString());
		
		
	}

}
