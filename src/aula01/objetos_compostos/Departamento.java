package aula01.objetos_compostos;

import java.util.ArrayList;

public class Departamento {
	
	String nome;
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	void cadastrar(String nome) {
		this.nome = nome;
	}
	
	void incluirFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);		
	}
	
	void fazerPagamento() {
		for (Funcionario funcionario : funcionarios) {
			//double salario = funcionario.calculaSalario(100);
			//funcionario.cc.recebeSalario(salario);
			funcionario.cc.recebeSalario(funcionario.calculaSalario(100));
		}
	}
	
}
