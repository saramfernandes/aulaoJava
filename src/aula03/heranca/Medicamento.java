package aula03.heranca;

public class Medicamento extends Produto {

	private String tarja;
	
	@Override
	public String toString() {
		return super.toString() + " (" + getTarja()+ ")";
	}

	public Medicamento(String nome, double valor, String tarja) {
		super(nome, valor);
		setTarja(tarja);
	}
	
	public Medicamento() {
		
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja.toUpperCase();
	}
}
