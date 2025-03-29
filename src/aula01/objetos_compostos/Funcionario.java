package aula01.objetos_compostos;

public class Funcionario {

	String nome;
	double vlHora;
	ContaCorrente cc = new ContaCorrente();
	
	void cadastrar(String nome, double vlHora) {
		this.nome = nome;
		this.vlHora = vlHora;
	}
	
	double calculaSalario(int qtdHoras) {
		return vlHora * qtdHoras;
	}	
}
