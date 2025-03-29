package aula01;

// --- Classe 1 para realizar teste com dados chumbados
public class PrincipalImc1 {
	
	// Método "main"
	public static void main(String[] args) {
		// Tirando a pessoa de dentro da forma
		Pessoa mAbaixoPeso = new Pessoa();
		Pessoa mAcimaPeso = new Pessoa();
		Pessoa mPesoNormal = new Pessoa();
		
		// f = feminino
		Pessoa fAbaixoPeso = new Pessoa();
		Pessoa fAcimaPeso = new Pessoa();
		Pessoa fPesoNormal = new Pessoa();
		
		// Criando a pessoa e chumbando características
		// Pessoa "mAbaixoPeso" chamando o método "cadastrar()" e passando os parâmetros
		mAbaixoPeso.cadastrar("Homem 1", 30, 1.90, 'M');
		mAcimaPeso.cadastrar("Homem 2", 130, 1.50, 'M');
		mPesoNormal.cadastrar("Homem 3", 70, 1.75, 'M');
	
		fAbaixoPeso.cadastrar("Mulher 1", 30, 1.90, 'F');
		fAcimaPeso.cadastrar("Mulher 2", 130, 1.50, 'F');
		fPesoNormal.cadastrar("Mulher 3", 70, 1.75, 'F');
		
		// Mostrando
		// syso + ctrl + espaço = Faz o System.out automaticamente
		System.out.println(mAbaixoPeso.toString());
		System.out.println(mAcimaPeso.toString());
		System.out.println(mPesoNormal.toString());
		
		System.out.println(fAbaixoPeso.toString());
		System.out.println(fAcimaPeso.toString());
		System.out.println(fPesoNormal.toString());
	}
}
