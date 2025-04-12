package exercicio;

public class Carro {
	
	String marca;
	int ano;
	String cor;
	
	void cadastrar(String marca, int ano, String cor) {
		this.marca = marca.toUpperCase();
		this.ano = ano;
		this.cor = cor;
	}
	
	boolean isPeriodo(int anoIni, int anoFin) {
		return ano >= anoIni && ano <= anoFin;
	}
	
	boolean isMarca(String marcaUser) {
		return marca.equals(marcaUser);
	}
	
	boolean isCor(String corUser) {
		return cor.equals(corUser);
	}
	
	@Override
	public String toString() {
		return marca + " - " + ano;
	}

}
