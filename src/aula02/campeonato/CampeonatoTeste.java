package aula02.campeonato;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampeonatoTeste {
	
	Time t1 = new Time("Brasil");
	Time t2 = new Time("Alemanha");
	Time t3 = new Time("Itália");
	Time t4 = new Time("França");
	
	@BeforeEach
	void inicializa() {
		t1.addJogador(new Jogador("Neymar", 10, 8));
		t1.addJogador(new Jogador("Rafinha", 11, 3));
		t1.addJogador(new Jogador("Alisson", 1, 0));
		
		t2.addJogador(new Jogador("A", 10, 5));
		t2.addJogador(new Jogador("B", 11, 5));
		t2.addJogador(new Jogador("C", 1, 3));
		
		t3.addJogador(new Jogador("D", 10, 2));
		t3.addJogador(new Jogador("E", 11, 2));
		t3.addJogador(new Jogador("F", 1, 0));
		
		t4.addJogador(new Jogador("g", 10, 2));
		t4.addJogador(new Jogador("h", 11, 2));
		t4.addJogador(new Jogador("i", 1, 0));
	}
	
	@Test
	void addJogadorTest() {
		/*
		 * Adicionar mais um jogador no time 1
		 * Verificar a quantidade de jogadores do time se fecha 4
		 * */
	}
	
	@Test
	void listaJogadorTest() {
		/*
		 * Listar os jogadores do time 4
		 * Verificar se retorna corretamente
		 * Atenção ao método listar jogadores <---
		 * */
	}
	
	@Test
	void artilheiroTest() {
		/*
		 * Verificar o artilheiro do time 1, 2, 3 e 4
		 * (j.getNome();)
		 * Verificar artilheiro do campeonato
		 * Criar um novo time e chamar o artilheiro (Comprovar que retorna Null)
		 * */
	}
	
	@Test
	void timeMaisGolsTest() {
		/*
		 * Verificar a quantidade de gols de cada time
		 * Verificar o time com mais gols (Alemanha)
		 * */
	}

}
