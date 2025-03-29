package aula01;

// ---- Classe (forma, tipo forma de bolo)
public class Pessoa {

	// ---- Atributos (características)
	String nome;
	double peso, altura;
	char sexo;

	// ---- Métodos (ações/comportamentos)
	
	// Método para cadastrar a pessoa (futuramente será o construtor, mas ainda não vimos isso)
	public void cadastrar(String nome, double peso, double altura, char sexo) {
		// O "this" informa que a variável "nome" seria dessa classe "Pessoa" 
		// Por serem duas variáveis com o mesmo nome seria necessário usar o "this" para referenciar
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}

	// Método para calcular o IMC da Pessoa
	double calculaIMC() {
		return peso / (altura * altura);
	}

	// Método para saber se a pessoa está acima do peso, abaixo ou normal
	String avaliaIMC() {
		double imc = calculaIMC(); // Chamando o método clculaIMC() para saber o IMC
		
		// Esse if difere a mulher do homem (se: sexo for masculino))
		if (sexo == 'M') { // Aspas simples: porque é variável do tipo char
			// Não é necessário usar as { } nos if, pois o código possui apenas uma linha (só o return)
			if (imc < 18.5)
				return "Abaixo do Peso"; // Aspas duplas: porque é variável do tipo String
			else if (imc >= 25)
				return "Acima do Peso";
			else 
				return "Peso Normal";	
		} else {
			if (imc < 17.5)
				return "Abaixo do Peso";
			else if (imc >= 23)
				return "Acima do Peso";
			else
				return "Peso Normal";
		}
	}

	// Método que irá retornar uma String (responder o usuário)
	public String toString() {
		return nome + ": " + avaliaIMC();
	}

}
