package aula01;

import javax.swing.JOptionPane;

// Classe 2 para realizar teste solicitando os dados
public class PrincipalImc2 {
	
	public static void main(String[] args) {
		
		// Vamos pedir para o usuário inserir os dados
		// Criando um "For": primeiro declaramos a variável i; informamos até on i deve ir(<6); definimos que a cada loop o i vai receber +1 (++)
		for(int i=0; i<6; i++) {
			
			// JOptionPane.showInputDialog -> abre uma caixinha de diálogo
			String nome = JOptionPane.showInputDialog("Informe o nome");
			// Double.parseDouble -> transforma a "String" digitada pelo usuário em double
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
			// .toUpperCase() -> Define tudo o que o usuário digitar em maiúsculo
			// .charAt(0) -> Pega o caracter que está na posição 0, ex: FEMININO, a posição 0 = F
			char sexo = JOptionPane.showInputDialog("Informe o Sexo (M/F)").toUpperCase().charAt(0);
			
			// Instanciando o objeto Pessoa
			Pessoa p = new Pessoa();
			p.cadastrar(nome, peso, altura, sexo);
			
			//Mostrando a avaliação (.showMessageDialog -> abre a caixinha de mensagem)
			JOptionPane.showMessageDialog(null, p.toString());
		}
	}
}
