package aula03.heranca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HerancaTest {

	@Test
	void herancaTest() {
		Medicamento m = new Medicamento("Anador", 10, "vermelha");
		System.out.println(m.toString());
		System.out.println(m.ehCaro());
		
		Carro c = new Carro("Civic", 120000, 2024);
		System.out.println(c.toString());
		System.out.println(c.ehCaro());
	}

}
