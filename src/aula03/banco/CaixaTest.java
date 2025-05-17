package aula03.banco;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaixaTest {
	
	ArrayList<Conta> contas;
	
	@BeforeEach
	void inicializa() {
		contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta(123, 01, "Maria", 5000);
		Conta c2 = new Conta(456, 01, "João", 2000);
		Conta ce1 = new ContaEspecial(789, 02, "Pedro", 9000, 3000);
		Conta ce2 = new ContaEspecial(987, 02, "Lara", 3000, 1000);
		Conta cu1 = new ContaUniversitaria(987, 02, "Carlos", 1500);
		Conta cu2 = new ContaUniversitaria(987, 02, "Ana", 2000);
		
		contas.add(c1);
		contas.add(c2);
		contas.add(ce1);
		contas.add(ce2);
		contas.add(cu1);
		contas.add(cu2);
	}

	@Test
	void saqueTest() {
		
	}

}
