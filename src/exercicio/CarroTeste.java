package exercicio;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroTeste {
	
	ArrayList<Carro> lista;
	
	@BeforeEach
	void inicializa() {
		lista = new ArrayList<Carro>();
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		Carro c3 = new Carro();
		Carro c4 = new Carro();
		Carro c5 = new Carro();
		c1.cadastrar("chevrolet", 2000, "branco");
		c2.cadastrar("ford", 2010, "branco");
		c3.cadastrar("peugeot", 2024, "preto");
		c4.cadastrar("peugeot", 2024, "prata");
		c5.cadastrar("fiat", 1984, "branco");
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
	}

	@Test
	void cadastrarTest() {
		Carro c = new Carro();
		c.cadastrar("a", 1, "A");
		lista.add(c);
		assertEquals(6, lista.size());
		assertEquals("A - 1", lista.get(5).toString());	
	}
	
	@Test
	void buscaPeriodoTest() {
		int qtd = 0;
		for (Carro c : lista) {
			if (c.isPeriodo(2000, 2025))
				qtd++;
		}
		assertEquals(4, qtd);
		assertEquals("80,0%", calculaPercentual(qtd));
	}
	
	@Test
	void buscaPeriodoInesistenteTest() {
		int qtd = 0;
		for (Carro c : lista) {
			if (c.isPeriodo(2025, 2026))
				qtd++;
		}
		assertEquals(0, qtd);
		assertEquals("00,0%", calculaPercentual(qtd));
	}
	
	@Test
	void buscaMarcaTest() {
		int qtd = 0;
		for (Carro c : lista) {
			if (c.isMarca("PEUGEOT"))
				qtd++;
		}
		assertEquals(2, qtd);
		assertEquals("40,0%", calculaPercentual(qtd));
	}
	
	@Test
	void buscaMarcaInesistenteTest() {
		int qtd = 0;
		for (Carro c : lista) {
			if (c.isMarca("TOYOTA"))
				qtd++;
		}
		assertEquals(0, qtd);
		assertEquals("00,0%", calculaPercentual(qtd));
	}
	
	@Test
	void buscaCorTest() {
		int qtd = 0;
		for (Carro c : lista) {
			if (c.isCor("branco"))
				qtd++;
		}
		assertEquals(3, qtd);
		assertEquals("60,0%", calculaPercentual(qtd));
	}
	
	@Test
	void buscaCorInesistenteTest() {
		int qtd = 0;
		for (Carro c : lista) {
			if (c.isCor("azul"))
				qtd++;
		}
		assertEquals(0, qtd);
		assertEquals("00,0%", calculaPercentual(qtd));
	}
	
	String calculaPercentual(int qt) {
		double perc = (double)qt / lista.size() * 100;
		DecimalFormat df = new DecimalFormat("00.0");
		return df.format(perc)+ "%" ; 
	}

}
