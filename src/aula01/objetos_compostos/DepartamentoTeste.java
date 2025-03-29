package aula01.objetos_compostos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepartamentoTeste {

	@Test
	void salariosTest() {
		Departamento d = new Departamento();
		d.cadastrar("RH");
		
		Funcionario f1 = new Funcionario();
		f1.cadastrar("Gerente A", 60.00);
		Funcionario f2 = new Funcionario();
		f2.cadastrar("Funcionario B", 40.00);
		Funcionario f3 = new Funcionario();
		f3.cadastrar("Estagiario C", 15.00);
		
		d.incluirFuncionario(f1);
		d.incluirFuncionario(f2);
		d.incluirFuncionario(f3);
		
		d.fazerPagamento();
		
		assertEquals(6000.00, f1.cc.saldo);
		assertEquals(4000.00, f2.cc.saldo);
		assertEquals(1500.00, f3.cc.saldo);
	}

}
